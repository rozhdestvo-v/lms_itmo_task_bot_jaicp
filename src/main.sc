theme: /

    state: Start
        q!: *start
        q!: *(привет/здравствуй*/~добрый (~утро/~вечер/~день/~ночь))
        a: Начнём.

    state: Hello
        q!: *hello
        a: Привет! Чем могу помочь?

    state: Weather
        q!: *weather
        q!: *(погод*/дождь/солн*)
        a: Погода сегодня отличная, солнечно!

    state: Currency
        q!: *currency
        a: Курс валют: доллар — 90 руб., евро — 100 руб.

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}