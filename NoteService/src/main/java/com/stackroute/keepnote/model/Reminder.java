package com.stackroute.keepnote.model;

import java.util.Date;

public class Reminder {

	/*
	 * This class should have six fields
	 * (reminderId,reminderName,reminderDescription,reminderType,
	 * reminderCreatedBy,reminderCreationDate).  This class should also contain the
	 * getters and setters for the fields along with the no-arg , parameterized
	 * constructor and toString method. The value of reminderCreationDate should not
	 * be accepted from the user but should be always initialized with the system
	 * date.
	 */
	private String reminderId;
	private String reminderName;
	private String reminderDescription;
	private String reminderType;
	private String reminderCreatedBy;
	private Date reminderCreationDate;

	public Reminder() {

	}

	public Reminder(String id, String name, String des, String type, String created, Date date) {
		this.reminderId = id;
		this.reminderName = name;
		this.reminderDescription = des;
		this.reminderType = type;
		this.reminderCreatedBy = created;
		this.reminderCreationDate = date;
	}

	public String getReminderId() {
		return this.reminderId;
	}

	public void setReminderId(String reminderId) {
		this.reminderId = reminderId;
	}

	public String getReminderName() {
		return this.reminderName;
	}

	public void setReminderName(String reminderName) {
		this.reminderName = reminderName;
	}

	public String getReminderDescription() {
		return this.reminderDescription;
	}

	public void setReminderDescription(String reminderDescription) {
		this.reminderDescription = reminderDescription;
	}

	public String getReminderType() {
		return this.reminderType;
	}

	public void setReminderType(String reminderType) {
		this.reminderType = reminderType;
	}

	public String getReminderCreatedBy() {
		return this.reminderCreatedBy;
	}

	public void setReminderCreatedBy(String reminderCreatedBy) {
		this.reminderCreatedBy = reminderCreatedBy;
	}

	public Date getReminderCreationDate() {
		return this.reminderCreationDate;
	}

	public void setReminderCreationDate(Date reminderCreationDate) {
		this.reminderCreationDate = reminderCreationDate;
	}
}