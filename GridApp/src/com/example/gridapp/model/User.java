/**
 * 
 */
package com.example.gridapp.model;

import java.io.Serializable;

/**
 * @author Manish Pathak
 *
 */
public class User implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ringtoneName;
	private int ringtoneId;
	private int ringtoneResId;
	
	public User()
	{
		
	}
	
	public User(int ringtoneId, String ringtoneName, int ringtoneResId)
	{
		this.ringtoneId = ringtoneId;
		this.ringtoneName = ringtoneName;
		this.ringtoneResId = ringtoneResId;
	}

	public String getRingtoneName()
	{
		return ringtoneName;
	}
	public void setRingtoneName(String ringtoneName)
	{
		this.ringtoneName = ringtoneName;
	}
	public int getRingtoneId()
	{
		return ringtoneId;
	}
	public void setRingtoneId(int ringtoneId)
	{
		this.ringtoneId = ringtoneId;
	}
	public int getRingtoneResId()
	{
		return ringtoneResId;
	}
	public void setRingtoneResId(int ringtoneResId)
	{
		this.ringtoneResId = ringtoneResId;
	}
}
