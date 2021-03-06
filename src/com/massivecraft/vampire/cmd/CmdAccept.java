package com.massivecraft.vampire.cmd;

import com.massivecraft.mcore1.cmd.VisibilityMode;
import com.massivecraft.mcore1.cmd.req.ReqIsPlayer;

public class CmdAccept extends VCommand
{
	public CmdAccept()
	{
		this.addAliases("accept");
		
		this.setDesc("accept infection from someone");
		this.setVisibilityMode(VisibilityMode.INVISIBLE);
		
		this.addRequirements(ReqIsPlayer.getInstance());
	}
	
	@Override
	public void perform()
	{
		this.vme().acceptInfection();
	}
}
