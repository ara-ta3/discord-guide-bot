package com.ru.waka

import com.typesafe.config.{Config, ConfigFactory}
import discord4j.core.DiscordClientBuilder
import discord4j.core.event.domain.lifecycle.ReadyEvent

object Application {
  def main(args: Array[String]): Unit = {
    val config: Config = ConfigFactory.load()
    val token = config.getString("discordToken")

    val cli = new DiscordClientBuilder(token).build()
    cli.getEventDispatcher.on(classOf[ReadyEvent])
      .subscribe(ready => println("Logged in as " + ready.getSelf.getUsername))

    cli.login().block()
    ()
  }
}
