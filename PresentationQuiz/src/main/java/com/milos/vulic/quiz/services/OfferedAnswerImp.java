package com.milos.vulic.quiz.services;

import com.milos.vulic.quiz.models.OfferedAnswer;
import com.milos.vulic.quiz.repositories.OfferedAnswerRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferedAnswerImp implements OfferedAnswerService {

    private final OfferedAnswerRepository offeredAnswerRepository;

    public OfferedAnswerImp(OfferedAnswerRepository offeredAnswerRepository) {
        this.offeredAnswerRepository = offeredAnswerRepository;
    }

    @Override
    public List<OfferedAnswer> getListOfOfferedAnswersByQuestionId(Long id) {
        Singleton.getInstance().addPrWriteFile("Произошел поиск в таблице OfferedAnswer");
        return offeredAnswerRepository.getAllByQuestion_QuestionId(id, Sort.by("offeredAnswerId"));
    }

    @Override
    public List<OfferedAnswer> getAllTrueOffers() {
        Singleton.getInstance().addPrWriteFile("Произошел поиск в таблице OfferedAnswer");
        return offeredAnswerRepository.findAllByCorrectnessIsTrue();
    }

    @Override
    public OfferedAnswer findCorrectAnswerByQuestionId(Long id) {
        Singleton.getInstance().addPrWriteFile("Произошел поиск в таблице OfferedAnswer");
        return offeredAnswerRepository.findTopByQuestion_QuestionIdAndCorrectnessIsTrue(id);
    }

    @Override
    public OfferedAnswer findOfferedAnswerById(Long id) {
        Singleton.getInstance().addPrWriteFile("Произошел поиск в таблице OfferedAnswer");
        return offeredAnswerRepository.findByOfferedAnswerId(id);
    }

    @Override
    public void addOfferedAnswer(OfferedAnswer offeredAnswer) {

        offeredAnswerRepository.save(offeredAnswer);
        Singleton.getInstance().addPrWriteFile("Произошло изменение в таблице OfferedAnswer");
    }

    @Override
    public void deleteOfferedAnswerById(Long id) {
        offeredAnswerRepository.deleteById(id);
        Singleton.getInstance().addPrWriteFile("Произошло изменение в таблице OfferedAnswer");
    }
}
