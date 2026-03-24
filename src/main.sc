theme: /

    state: Start
        q!: *start
        a: Начнём.

    state: hello
        q!: *hello
        q!: *(привет/здравствуй*/~добрый (~утро/~вечер/~день/~ночь))
        a: Привет! Чем могу помочь?

    state: weather
        q!: *weather
        q!: *(погод*/дождь/солн*)
        a: Погода сегодня отличная, солнечно!

    state: currency
        q!: *currency
        q!: *(валю*/курс/рубл*/доллар*)
        a: Курс валют: доллар — 90 руб., евро — 100 руб.

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}