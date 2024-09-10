package com.example.quizapp

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "What country does this car company belongs to?",
            R.drawable.koenigsegg,
            arrayListOf("Germany", "Japan", "America", "Sweden"),
            3,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "Which Manufacturer developed the engine for this car?",
            R.drawable.mclarenf1,
            arrayListOf("BMW", "Ford",
            "General Motors", "Toyota"),
            0
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "Who was responsible for the rise of Volkswagen Group?",
            R.drawable.volkswagen,
            arrayListOf("Hitler", "Ferdinand Piëch",
            "Ferdinand Porsche", "Rudolf Leiding"),
            1
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "Who is the Genius behind this masterpiece?",
            R.drawable.vwgolf,
            arrayListOf("Gordon Ramsay", "Gordon Murray",
            "Giorgetto Giugiaro", "Shelby"),
            2
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "Which country is this company from?",
            R.drawable.bugatti,
            arrayListOf("Italy", "France",
            "Germany", "Finland"),
            1
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "Which is the popular track of this country?",
            R.drawable.flag_of_germany,
            arrayListOf("Nürburgring", "Le Mans",
            "Silverstone", "none of these"),
            0
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "Which country was the founder of this company from?",
            R.drawable.bugatti,
            arrayListOf("Italy", "France",
            "Denmark", "Spain"),
            0
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "Which country hosted the 2011 F1 Grand Prix?",
            R.drawable.f1,
            arrayListOf("Ireland", "Iran",
            "Hungary", "India"),
            3
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "What country is this company from?",
            R.drawable.holden,
            arrayListOf("Australia", "New Zealand",
            "Tuvalu", "United States of America"),
            0
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "What is an obvious upgrade to a BMW?",
            R.drawable.bmw,
            arrayListOf("Ferrari", "McLaren",
            "Porsche", "Pagani"),
            2
        )
        questionsList.add(questionTen)

        return questionsList
    }
}