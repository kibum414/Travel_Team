package com.example.demo.pts.service;

import java.util.List;

import com.example.demo.pts.domain.Participant;

public interface ParticipantService {
	
	public void register(Participant participant) throws Exception;
	
	public void modify(Participant participant) throws Exception;
	
	public void delete(Long participantNo) throws Exception;
	
	public Participant detail(Long participantNo) throws Exception;
	
	public List<Participant> list() throws Exception;
}
