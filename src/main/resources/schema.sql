CREATE TABLE MultipleChoiceQuestions(
    Mcq_Id BIGSERIAL PRIMARY KEY,
    Question varchar(50)  NOT NULL,
    Answer VARCHAR(50)  NOT NULL,
    Distractor_1 VARCHAR(50),
    Distractor_2 VARCHAR(50),
    Distractor_3 VARCHAR(50),
    Distractor_4 VARCHAR(50)
);