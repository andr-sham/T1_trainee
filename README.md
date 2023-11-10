# T1_trainee

Тестовое задание на должность Java-разработчик (Стажер)

## Getting Started

Склонируйте репозиторий, соберите его через Maven, запустите в IDE.
Интерфейс взаимодействия реализован через REST API. Для проверки работы необходимо
отправить POST запрос на URL /charcalculate с прикреплённым телом запроса, в котором в формате JSON
указана требуемая строка в качестве параметра requestString. Например:  
`
{  
"requestString": "aaassdd;"  
}
`

Результат возвращается так же в формате JSON, например:  
`
{  
"responseString": "a: 3, s: 2, d: 2, ;: 1"  
}
`

В случае попытки задать пустую строку или null будет выведена сообщение об ошибке  
`
{  
"errorMessages": [  
"Введён null или пустая строка, введите строку с символами"  
]  
}
`

### Documantation

Документация лежит в папке doc

### Prerequisites

Java 17+

## Running the tests

Тесты содержатся в папке src/test

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Andrei Shamshurin** - [andr-sham](https://github.com/andr-sham)



