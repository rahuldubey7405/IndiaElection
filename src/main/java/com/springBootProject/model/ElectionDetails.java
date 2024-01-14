package com.springBootProject.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "electiondetails")
public class ElectionDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "electiondate", nullable = false)
	private LocalDate electionDate;
	@Column(name = "electionstarttime", nullable = false)
	private LocalTime electionStartTime;
	@Column(name = "electionendtime", nullable = false)
	private LocalTime electionEndTime;
	@Column(name = "electionstate", nullable = false)
	private String electionState;
	@Column(name = "electioncity", nullable = false)
	private String electionCity;
	@Column(name = "pollingboothname", nullable = false)
	private String pollingBoothName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getElectionDate() {
		return electionDate;
	}

	public void setElectionDate(LocalDate electionDate) {
		this.electionDate = electionDate;
	}

	public LocalTime getElectionStartTime() {
		return electionStartTime;
	}

	public void setElectionStartTime(LocalTime electionStartTime) {
		this.electionStartTime = electionStartTime;
	}

	public LocalTime getElectionEndTime() {
		return electionEndTime;
	}

	public void setElectionEndTime(LocalTime electionEndTime) {
		this.electionEndTime = electionEndTime;
	}

	public String getElectionState() {
		return electionState;
	}

	public void setElectionState(String electionState) {
		this.electionState = electionState;
	}

	public String getElectionCity() {
		return electionCity;
	}

	public void setElectionCity(String electionCity) {
		this.electionCity = electionCity;
	}

	public String getPollingBoothName() {
		return pollingBoothName;
	}

	public void setPollingBoothName(String pollingBoothName) {
		this.pollingBoothName = pollingBoothName;
	}

}
