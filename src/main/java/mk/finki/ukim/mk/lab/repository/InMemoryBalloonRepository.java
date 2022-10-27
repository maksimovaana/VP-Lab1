package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab.model.Balloon;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class InMemoryBalloonRepository {
    public List<Balloon> findAll() {
        return DataHolder.balloons;
    }

    public List<Balloon> search(String text) {
        return DataHolder.balloons.stream().filter(r->r.getName().equals(text) ||
                r.getDescription().equals(text)).collect(Collectors.toList());
    }
}
