package me.y9san9.prizebot.resources.locales

import dev.inmo.tgbotapi.types.message.textsources.bold
import dev.inmo.tgbotapi.types.message.textsources.link
import dev.inmo.tgbotapi.types.message.textsources.plus
import dev.inmo.tgbotapi.types.message.textsources.regular
import me.y9san9.extensions.string.awesomeCut
import me.y9san9.prizebot.resources.Emoji
import me.y9san9.prizebot.resources.MAX_TITLE_LEN

object ArLocale : Locale() {
    override val start = regular("مرحباً! أنا ") + bold("PrizeBot") +
        regular(
            "، هنا يمكنك إجراء سحوبات الجوائز بشكل عشوائي وشفاف. " +
                "يمكنك اختيار شروط المشاركة مثل الاشتراك في القنوات. " +
                "يتم اختيار الفائزين بشكل عشوائي باستخدام random.org، ويمكنك مشاهدة الكود المصدري ",
        ) +
        link(
            text = "هنا",
            url = "https://github.com/y9san9/prizebot",
        ) +
        "\nلمشاهدة جميع الأوامر المتاحة استخدم /help"

    override fun unknownCommand(command: String) = "الأمر غير معروف '$command'"

    override fun invalidArgsCount(expected: Int, actual: Int) =
        "المطلوب $expected من الوسائط لهذا الأمر، لكن تم العثور على $actual"

    override val enterText = "أرسل النص!"

    override val help =
        "مرحباً! أنا بوت متقدم للمسابقات، وهذه قائمة الأوامر المتاحة:\n" +
            "- /start: بدء البوت\n" +
            "- /help: عرض هذه الرسالة\n" +
            "- /giveaway: إنشاء مسابقة جديدة\n" +
            "- /my_giveaways: عرض المسابقات التي أنشأتها\n" +
            "- /language: اختيار لغة البوت\n"

    override val helpKeyboard = "${Emoji.HELP} المساعدة"
    override val giveawayKeyboard = "${Emoji.GIFT} مسابقة جديدة"
    override val selfGiveawaysKeyboard = "${Emoji.SETTINGS} مسابقاتي"

    override val giveawayTitleInput = "حسناً، لنبدأ إنشاء المسابقة. أرسل اسم المسابقة (استخدم /cancel للإلغاء)"
    override val giveawayParticipateInput = "ممتاز! أرسل النص الذي سيظهر على زر المشاركة (استخدم /cancel للإلغاء أو /skip لاستخدام ${Emoji.HEART} الافتراضي)"

    override val cancel = "رجوع"
    override val cancelled = "تم الإلغاء!"

    override val skip = "تخطي"

    override val giveawayCreated = "تم إنشاء المسابقة، يمكنك مشاهدة رسالة المعاينة أدناه"

    override val giveawayParticipateHint = "للمشاركة في المسابقة اضغط الزر أدناه."

    override val giveawayTitleTooLong = "الحد الأقصى لطول اسم المسابقة هو $MAX_TITLE_LEN حرفاً، حاول مرة أخرى"

    override val send = "إرسال..."

    override fun participateText(text: String) = "زر المشاركة: $text"

    override val cannotParticipateInSelfGiveaway = "لا يمكنك المشاركة في مسابقتك الخاصة!"

    override val nowParticipating = "تم تسجيل مشاركتك في المسابقة!"

    override val youHaveLeftGiveaway = "لقد خرجت من المسابقة"

    override val alreadyParticipating = "أنت مشارك بالفعل في المسابقة"

    override val highLoadMessage =
        "البوت يستقبل حالياً عدداً كبيراً من الطلبات، يرجى الانتظار. " +
            "إذا لم تكن قد استخدمت /start من قبل، أرسله للبوت ليتمكن لاحقاً من إعلامك بحالتك"

    override val selectGiveawayToView = "اختر مسابقة من القائمة أدناه لعرض التفاصيل"

    override val noGiveawaysYet = "لم تنشئ أي مسابقات بعد. يمكنك إنشاء واحدة باستخدام /giveaway"

    override val switchPmNoGiveawaysYet = "اضغط لإنشاء أول مسابقة لك"

    override val delete = "حذف ${Emoji.TRASH}"

    override fun giveawayDeleted(title: String) = regular("تم حذف المسابقة '") +
        bold(title.awesomeCut(maxLength = 30)) + "'"

    override val thisGiveawayDeleted = "تم حذف هذه المسابقة."

    override val raffle = "إجراء السحب ${Emoji.GIFT}"

    override fun winner(plural: Boolean) =
        if (plural) "الفائزون" else "الفائز"

    override val deletedUser = "مستخدم محذوف"

    override fun unknownUser(userId: Long) = "مستخدم غير معروف ($userId)"

    override val participantsCountIsNotEnough =
        "عدد المشاركين غير كافٍ لإجراء السحب!"

    override val giveawayFinished = "انتهت المسابقة بالفعل!"

    override val giveawayDoesNotExist = "المسابقة غير موجودة"

    override val selectLocale = "اختر لغة البوت من الأزرار أدناه"

    override val localeSelected = "تم تغيير اللغة!"

    override fun confirmation(confirmationText: String) =
        "هل أنت متأكد أنك تريد $confirmationText؟"

    override val confirm = "تأكيد"

    override val deleteGiveawayConfirmation = "حذف المسابقة"

    override val raffleGiveawayConfirmation = "إجراء السحب"

    override val enterRaffleDateInput =
        regular("أدخل تاريخ السحب التلقائي بأحد التنسيقات التالية: ") +
            bold("00:00") + ", " +
            bold("00:00 13.01") + ", " +
            bold("00:00 13.01.2020") +
            " (استخدم /skip للتخطي أو /cancel للإلغاء). " +
            "يمكنك اختيار المنطقة الزمنية في الخطوة التالية."

    override val invalidDateFormat = "تنسيق التاريخ غير صحيح، حاول مرة أخرى"

    override val selectOffset = "اختر المنطقة الزمنية من الأزرار أدناه"

    override val customTimeOffset = "منطقة زمنية مخصصة"

    override val `UTC-4` = "نيويورك -4"
    override val `UTC-3` = "البرازيل -3"
    override val GMT = "غرينتش +0"
    override val UTC1 = "برلين +1"
    override val UTC2 = "كييف +2"
    override val UTC3 = "موسكو +3"
    override val UTC5_30 = "الهند +5:30"
    override val UTC8 = "بكين +8"
    override val UTC9 = "طوكيو +9"

    override val customTimezoneInput =
        regular("أدخل المنطقة الزمنية بأحد التنسيقات التالية: ") +
            bold("+9") + ", " + bold("-9:30")

    override val invalidTimezoneFormat = "تنسيق المنطقة الزمنية غير صحيح، حاول مرة أخرى"

    override val raffleDate = "تاريخ السحب"

    override fun lackOfParticipants(giveawayTitle: String) =
        "لا يمكن إجراء السحب تلقائياً للمسابقة '$giveawayTitle' بسبب عدم كفاية المشاركين، يمكنك إجراء السحب يدوياً لاحقاً"

    override val winnersCountIsOutOfRange =
        "عدد الفائزين يجب أن يكون بين 1 و50,000"

    override val winnersCount = "عدد الفائزين"

    override val enterNumber = "يرجى إدخال رقم"

    override val enterWinnersCount =
        "أدخل عدد الفائزين في هذه المسابقة (استخدم /skip للقيمة الافتراضية 1 أو /cancel للإلغاء)"

    override val chooseConditions =
        "الآن يمكنك اختيار شروط المشاركة (استخدم /next لإنشاء المسابقة بدون شروط أو /cancel للإلغاء)"

    override val chooseMoreConditions =
        "اختر الشرط التالي (استخدم /next لإنشاء المسابقة أو /cancel للإلغاء)"

    override val invitations = "دعوة الأصدقاء"

    override val channelSubscription = "الاشتراك في القناة"

    override val youHaveAlreadyAddedInvitations =
        "لقد أضفت شرط دعوة الأصدقاء بالفعل!"

    override val enterInvitationsCount = "أدخل عدد الدعوات المطلوبة للمشاركة"

    override val selectLinkedChat =
        "اختر القناة المرتبطة من الأزرار أدناه (استخدم /help لمعرفة كيفية ربط القناة أو /cancel للإلغاء)"

    override val updateChannels = "تحديث القنوات المرتبطة"

    override val channelsUpdated = "تم التحديث!"

    override val channelLinkingHelp =
        bold("لربط قناة أو مجموعة اتبع الخطوات التالية:\n\n") +
            "• أضف البوت إلى القناة أو المجموعة كمسؤول، ويجب أن يكون لها " +
            bold("اسم مستخدم عام (username)") +
            " حتى يتمكن الجميع من الانضمام إليها.\n" +
            "• اضغط على زر تحديث القنوات المرتبطة ثم اختر القناة.\n\n" +
            "إذا كان البوت موجوداً بالفعل في القناة ولكنها لا تظهر في القائمة، احذف البوت وأضفه مرة أخرى."

    override val channelIsNotLinked = "هذه القناة غير مرتبطة"

    override val channelIsAlreadyInConditions = "هذه القناة مضافة بالفعل إلى شروط المشاركة"

    override val giveawayConditions = "شروط المشاركة:"

    override fun subscribeTo(username: String) =
        regular("الاشتراك في ") + bold(username)

    override fun inviteFriends(count: Int) =
        regular("دعوة ") + bold("$count") + " من الأصدقاء للمشاركة في المسابقة"

    override val channelConditionRequiredForInvitations =
        "يجب إضافة اشتراك قناة واحد على الأقل لاستخدام دعوات الأصدقاء"

    override val invitationsCountShouldBePositive =
        "عدد الدعوات يجب أن يكون أكبر من صفر"

    override val giveawayInvalid =
        "تواصل مع المنظم لأن المسابقة تبدو غير صالحة"

    override val notSubscribedToConditions =
        "لم تشترك في جميع القنوات أو المجموعات المطلوبة"

    override val cannotMentionsUser =
        "يرجى السماح للبوت بإعادة توجيه الرسائل في الإعدادات حتى يتمكن من الإشارة إليك (سيتم تطبيق الإعداد خلال 5 دقائق)"

    override fun friendsAreNotInvited(invitedCount: Int, requiredCount: Int) =
        "لقد دعوت $invitedCount / $requiredCount من الأصدقاء"

    override val raffleProcessing = "يرجى الانتظار، جارٍ تنفيذ السحب"

    override val promoteBot = "يرجى ترقية البوت إلى مشرف"

    override val thisChatIsNotPublic = "هذه المحادثة ليست عامة، يرجى إضافة اسم مستخدم"

    override val displayWinnersWithEmoji =
        "عرض الفائزين مع الإيموجي بهذا الشكل؟\n\n" +
            "${Emoji.FIRST_PLACE} Foo Bar\n" +
            "${Emoji.SECOND_PLACE} Bar Foo\n" +
            "${Emoji.THIRD_PLACE} Baz Baz\n\n" +
            "هذا متاح فقط للمسابقات التي تحتوي على عدد فائزين من 2 إلى 10"

    override val yes = "نعم"

    override val no = "لا"
}
