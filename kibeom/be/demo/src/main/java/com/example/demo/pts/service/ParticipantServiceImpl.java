package com.example.demo.pts.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.pts.domain.Participant;
import com.example.demo.pts.repository.ParticipantRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ParticipantServiceImpl /*extends AbstractService<Participant>*/ implements ParticipantService {

	private final ParticipantRepository repo;

	@Override
	public void register(Participant participant) throws Exception {
		repo.save(participant);
	}

	@Override
	public void modify(Participant participant) throws Exception {
		repo.save(participant);
	}

	@Override
	public void delete(Long participantNo) throws Exception {
		repo.deleteById(participantNo);
	}

	@Override
	public Participant detail(Long participantNo) throws Exception {
		return repo.getOne(participantNo);
	}

	@Override
	public List<Participant> list() throws Exception {
		return repo.findAll();
	}

}
