package com.huskygriffon;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

//Config is the panel that you interact with in Runelite
@ConfigGroup("gefaconfig")
public interface gefaconfig extends Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Feeling?",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Fuuuuuuu";
	}
}
