require: slotfilling/slotFilling.sc
    module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        q!: $regex</hello>
        q!: $regex</Hello>
        a: Привет! Чем могу помочь?

    state: Weather
        q!: $regex</weather>
        q!: $regex</Weather>
        a: Погода сегодня отличная, солнечно!

    state: Currency
        q!: $regex</currency>
        q!: $regex</Currency>
        a: Курс валют: доллар — 90 руб., евро — 100 руб.

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}