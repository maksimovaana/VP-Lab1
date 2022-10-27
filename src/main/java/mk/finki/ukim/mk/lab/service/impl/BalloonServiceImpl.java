package mk.finki.ukim.mk.lab.service.impl;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Balloon;
import mk.finki.ukim.mk.lab.repository.InMemoryBalloonRepository;
import mk.finki.ukim.mk.lab.service.BalloonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BalloonServiceImpl implements BalloonService {

    private final InMemoryBalloonRepository balloonRepository;

    public BalloonServiceImpl(InMemoryBalloonRepository balloonRepository) {
        this.balloonRepository = balloonRepository;
    }

    @Override
    public List<Balloon> listAll() {
        return balloonRepository.findAll();
    }

    @Override
    public List<Balloon> searchByNameOrDescription(String text) {
        return balloonRepository.search(text);
    }
}
