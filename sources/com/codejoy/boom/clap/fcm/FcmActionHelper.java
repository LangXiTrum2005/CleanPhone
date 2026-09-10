package com.codejoy.boom.clap.fcm;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ironsource.C3414a2;
import cyclery.RegisterTokenReq;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.sakeen;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.creditor;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.Regex;

/* JADX INFO: compiled from: FcmActionHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u001d\u001a\u00020\r2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00192\u0006\u0010\u001c\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010!\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/codejoy/boom/clap/fcm/FcmActionHelper;", "", "<init>", "()V", "", "competently", "", "token", "apical", "(Ljava/lang/String;)V", "triweekly", "(Lwretchedly/dern;)Ljava/lang/Object;", "trigger", "", "isForceRefreshTopic", "Lkotlin/Function0;", "onComplete", "cutely", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)V", "beachfront", "()Ljava/lang/String;", "arytenoidectomy", "(Ljava/lang/String;Lwretchedly/dern;)Ljava/lang/Object;", "taiyuan", "(Ljava/lang/String;ZLwretchedly/dern;)Ljava/lang/Object;", "", "lastTopics", "currentTopics", "forceSubscribeCurrent", "kowloon", "(Ljava/util/Set;Ljava/util/Set;ZLwretchedly/dern;)Ljava/lang/Object;", "Lcom/codejoy/boom/clap/fcm/FcmActionHelper$attabal;", "topicInfo", "formularize", "(Ljava/lang/String;Lcom/codejoy/boom/clap/fcm/FcmActionHelper$attabal;Lwretchedly/dern;)Ljava/lang/Object;", "marial", "()Lcom/codejoy/boom/clap/fcm/FcmActionHelper$attabal;", "value", "impassible", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlinx/coroutines/saran;", "saneness", "Lkotlinx/coroutines/saran;", "scope", "attabal", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FcmActionHelper {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final FcmActionHelper f18220attabal = new FcmActionHelper();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final saran scope = privatdozent.attabal(sakeen.saneness(null, 1, null).plus(premeiotic.saneness()));

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final int f18221dern = 8;

    /* JADX INFO: renamed from: com.codejoy.boom.clap.fcm.FcmActionHelper$attabal, reason: from toString */
    /* JADX INFO: compiled from: FcmActionHelper.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\rR'\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0007j\b\u0012\u0004\u0012\u00020\u0002`\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/codejoy/boom/clap/fcm/FcmActionHelper$attabal;", "", "", "language", "country", "timezone", "timeOffset", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "topics", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/LinkedHashSet;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "attabal", "Ljava/lang/String;", "saneness", "dern", "wireman", "marial", "Ljava/util/LinkedHashSet;", "()Ljava/util/LinkedHashSet;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LanguageTopicInfo {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata and from toString */
        public final String language;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata and from toString */
        public final String timezone;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata and from toString */
        public final LinkedHashSet<String> topics;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata and from toString */
        public final String country;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata and from toString */
        public final String timeOffset;

        public LanguageTopicInfo(String language, String country, String timezone, String timeOffset, LinkedHashSet<String> topics) {
            Intrinsics.checkNotNullParameter(language, "language");
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(timezone, "timezone");
            Intrinsics.checkNotNullParameter(timeOffset, "timeOffset");
            Intrinsics.checkNotNullParameter(topics, "topics");
            this.language = language;
            this.country = country;
            this.timezone = timezone;
            this.timeOffset = timeOffset;
            this.topics = topics;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final String getTimeOffset() {
            return this.timeOffset;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LanguageTopicInfo)) {
                return false;
            }
            LanguageTopicInfo languageTopicInfo = (LanguageTopicInfo) other;
            return Intrinsics.wireman(this.language, languageTopicInfo.language) && Intrinsics.wireman(this.country, languageTopicInfo.country) && Intrinsics.wireman(this.timezone, languageTopicInfo.timezone) && Intrinsics.wireman(this.timeOffset, languageTopicInfo.timeOffset) && Intrinsics.wireman(this.topics, languageTopicInfo.topics);
        }

        public int hashCode() {
            return (((((((this.language.hashCode() * 31) + this.country.hashCode()) * 31) + this.timezone.hashCode()) * 31) + this.timeOffset.hashCode()) * 31) + this.topics.hashCode();
        }

        public final LinkedHashSet<String> marial() {
            return this.topics;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final String getLanguage() {
            return this.language;
        }

        public String toString() {
            return "LanguageTopicInfo(language=" + this.language + ", country=" + this.country + ", timezone=" + this.timezone + ", timeOffset=" + this.timeOffset + ", topics=" + this.topics + ")";
        }

        /* JADX INFO: renamed from: wireman, reason: from getter */
        public final String getTimezone() {
            return this.timezone;
        }
    }

    /* JADX INFO: compiled from: FcmActionHelper.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class saneness<T> implements kotlinx.coroutines.flow.wireman {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public static final saneness<T> f18228kowloon = new saneness<>();

        @Override // kotlinx.coroutines.flow.wireman
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public final Object emit(Unit unit, wretchedly.dern<? super Unit> dernVar) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "后端注册 token 成功");
            return Unit.f29295attabal;
        }
    }

    public static final void impromptu(FcmActionHelper fcmActionHelper, Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            com.codejoy.boom.clap.helper.dern dernVar = com.codejoy.boom.clap.helper.dern.f18260attabal;
            Exception exception = task.getException();
            dernVar.saneness("SmartPush", "获取 FCM token 失败：" + (exception != null ? exception.getMessage() : null));
            return;
        }
        String str = (String) task.getResult();
        if (str == null) {
            str = "";
        }
        String str2 = str.length() > 0 ? str : null;
        if (str2 != null) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "已获取 FCM token，开始同步");
            fcmActionHelper.apical(str2);
        }
    }

    public final void apical(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        kotlinx.coroutines.cutely.wireman(scope, null, null, new FcmActionHelper$registerFcmToken$1(token, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object arytenoidectomy(String str, wretchedly.dern<? super Unit> dernVar) {
        FcmActionHelper$synchronizeTokenAndTopics$1 fcmActionHelper$synchronizeTokenAndTopics$1;
        String strSaneness;
        LanguageTopicInfo languageTopicInfoMarial;
        Set<String> set;
        String str2;
        LanguageTopicInfo languageTopicInfo;
        if (dernVar instanceof FcmActionHelper$synchronizeTokenAndTopics$1) {
            fcmActionHelper$synchronizeTokenAndTopics$1 = (FcmActionHelper$synchronizeTokenAndTopics$1) dernVar;
            int i = fcmActionHelper$synchronizeTokenAndTopics$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fcmActionHelper$synchronizeTokenAndTopics$1.label = i - Integer.MIN_VALUE;
            } else {
                fcmActionHelper$synchronizeTokenAndTopics$1 = new FcmActionHelper$synchronizeTokenAndTopics$1(this, dernVar);
            }
        } else {
            fcmActionHelper$synchronizeTokenAndTopics$1 = new FcmActionHelper$synchronizeTokenAndTopics$1(this, dernVar);
        }
        Object obj = fcmActionHelper$synchronizeTokenAndTopics$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = fcmActionHelper$synchronizeTokenAndTopics$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                LanguageTopicInfo languageTopicInfo2 = (LanguageTopicInfo) fcmActionHelper$synchronizeTokenAndTopics$1.L$3;
                set = (Set) fcmActionHelper$synchronizeTokenAndTopics$1.L$2;
                String str3 = (String) fcmActionHelper$synchronizeTokenAndTopics$1.L$1;
                String str4 = (String) fcmActionHelper$synchronizeTokenAndTopics$1.L$0;
                p002kotlin.dern.saneness(obj);
                languageTopicInfoMarial = languageTopicInfo2;
                strSaneness = str3;
                str = str4;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                languageTopicInfo = (LanguageTopicInfo) fcmActionHelper$synchronizeTokenAndTopics$1.L$3;
                str2 = (String) fcmActionHelper$synchronizeTokenAndTopics$1.L$1;
                p002kotlin.dern.saneness(obj);
            }
            tau.saneness sanenessVar = tau.saneness.f38666attabal;
            sanenessVar.restrictive(languageTopicInfo.marial());
            Intrinsics.beachfront(str2);
            sanenessVar.supplicat(str2);
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "token 和主题同步成功，缓存已更新");
            return Unit.f29295attabal;
        }
        p002kotlin.dern.saneness(obj);
        strSaneness = com.blankj.utilcode.util.competently.saneness(str);
        tau.saneness sanenessVar2 = tau.saneness.f38666attabal;
        Set<String> setTaiyuan = sanenessVar2.taiyuan();
        languageTopicInfoMarial = marial();
        com.codejoy.boom.clap.helper.dern dernVar2 = com.codejoy.boom.clap.helper.dern.f18260attabal;
        dernVar2.saneness("SmartPush", "开始同步 token 和主题：旧=" + setTaiyuan + "，目标=" + languageTopicInfoMarial.marial());
        if (Intrinsics.wireman(strSaneness, sanenessVar2.impromptu()) && Intrinsics.wireman(languageTopicInfoMarial.marial(), setTaiyuan)) {
            dernVar2.saneness("SmartPush", "token 和主题未变化，跳过同步");
            return Unit.f29295attabal;
        }
        LinkedHashSet<String> linkedHashSetMarial = languageTopicInfoMarial.marial();
        fcmActionHelper$synchronizeTokenAndTopics$1.L$0 = str;
        fcmActionHelper$synchronizeTokenAndTopics$1.L$1 = strSaneness;
        fcmActionHelper$synchronizeTokenAndTopics$1.L$2 = igo.impromptu.attabal(setTaiyuan);
        fcmActionHelper$synchronizeTokenAndTopics$1.L$3 = languageTopicInfoMarial;
        fcmActionHelper$synchronizeTokenAndTopics$1.label = 1;
        if (kowloon(setTaiyuan, linkedHashSetMarial, false, fcmActionHelper$synchronizeTokenAndTopics$1) != objBeachfront) {
            set = setTaiyuan;
        }
        return objBeachfront;
        fcmActionHelper$synchronizeTokenAndTopics$1.L$0 = igo.impromptu.attabal(str);
        fcmActionHelper$synchronizeTokenAndTopics$1.L$1 = strSaneness;
        fcmActionHelper$synchronizeTokenAndTopics$1.L$2 = igo.impromptu.attabal(set);
        fcmActionHelper$synchronizeTokenAndTopics$1.L$3 = languageTopicInfoMarial;
        fcmActionHelper$synchronizeTokenAndTopics$1.label = 2;
        if (formularize(str, languageTopicInfoMarial, fcmActionHelper$synchronizeTokenAndTopics$1) != objBeachfront) {
            str2 = strSaneness;
            languageTopicInfo = languageTopicInfoMarial;
            tau.saneness sanenessVar3 = tau.saneness.f38666attabal;
            sanenessVar3.restrictive(languageTopicInfo.marial());
            Intrinsics.beachfront(str2);
            sanenessVar3.supplicat(str2);
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "token 和主题同步成功，缓存已更新");
            return Unit.f29295attabal;
        }
        return objBeachfront;
    }

    public final String beachfront() {
        int offset = TimeZone.getDefault().getOffset(System.currentTimeMillis());
        int iAbs = Math.abs(offset);
        int i = iAbs / 3600000;
        int i2 = (iAbs % 3600000) / 60000;
        StringBuilder sb = new StringBuilder();
        if (offset < 0) {
            sb.append("minus_");
        }
        sb.append(i);
        if (i2 != 0) {
            sb.append("_" + i2);
        }
        return sb.toString();
    }

    public final void competently() {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(FirebaseMessaging.arytenoidectomy().molybdenite().addOnCompleteListener(new OnCompleteListener() { // from class: com.codejoy.boom.clap.fcm.saneness
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    FcmActionHelper.impromptu(this.f18242attabal, task);
                }
            }));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "初始化 FCM token 失败：" + thM3354exceptionOrNullimpl.getMessage());
        }
    }

    public final void cutely(String trigger, boolean isForceRefreshTopic, Function0<Unit> onComplete) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "开始刷新主题：来源=" + trigger + "，强制=" + isForceRefreshTopic);
        kotlinx.coroutines.cutely.wireman(scope, null, null, new FcmActionHelper$refreshLanguageTopicSubscription$1(trigger, isForceRefreshTopic, onComplete, null), 3, null);
    }

    public final Object formularize(String str, LanguageTopicInfo languageTopicInfo, wretchedly.dern<? super Unit> dernVar) {
        com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "开始向后端注册 token，主题数=" + languageTopicInfo.marial().size());
        Object objCollect = kotlinx.coroutines.flow.marial.beachfront(spatterdash.saneness.Companion.saneness(spatterdash.saneness.INSTANCE, null, 1, null).dern(new RegisterTokenReq(str, CollectionsKt.molet(languageTopicInfo.marial()), languageTopicInfo.getLanguage(), languageTopicInfo.getCountry(), languageTopicInfo.getTimezone(), languageTopicInfo.getTimeOffset())), new FcmActionHelper$reportFcmTokenToServer$2(null)).collect(saneness.f18228kowloon, dernVar);
        return objCollect == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCollect : Unit.f29295attabal;
    }

    public final String impassible(String value) {
        return new Regex("[^A-Za-z0-9\\-_.~%]").replace(value, "_");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:32:0x011b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x011b -> B:33:0x011e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0199 -> B:40:0x019c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object kowloon(java.util.Set<java.lang.String> r18, java.util.Set<java.lang.String> r19, boolean r20, wretchedly.dern<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codejoy.boom.clap.fcm.FcmActionHelper.kowloon(java.util.Set, java.util.Set, boolean, wretchedly.dern):java.lang.Object");
    }

    public final LanguageTopicInfo marial() {
        jugal.attabal attabalVar = jugal.attabal.f29013attabal;
        String strBeachfront = attabalVar.beachfront();
        String id = TimeZone.getDefault().getID();
        String strBeachfront2 = beachfront();
        Intrinsics.beachfront(id);
        LinkedHashSet linkedHashSetBeachfront = creditor.beachfront("topic-data-all", "topic-data-android", "topic-smart-resident", "topic-smart-data-language-" + strBeachfront, "topic-biz-data-language-" + strBeachfront, "topic-data-timezone-" + impassible(id), "topic-data-tz_utc_" + strBeachfront2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(linkedHashSetBeachfront);
        return new LanguageTopicInfo(strBeachfront, attabalVar.marial(), id, strBeachfront2, linkedHashSet);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0102 A[Catch: CancellationException -> 0x0049, all -> 0x00f6, TRY_LEAVE, TryCatch #3 {all -> 0x00f6, blocks: (B:42:0x00ef, B:47:0x00fc, B:49:0x0102, B:58:0x013c, B:59:0x0143), top: B:76:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x013c A[Catch: CancellationException -> 0x0049, all -> 0x00f6, TRY_ENTER, TryCatch #3 {all -> 0x00f6, blocks: (B:42:0x00ef, B:47:0x00fc, B:49:0x0102, B:58:0x013c, B:59:0x0143), top: B:76:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0153  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object taiyuan(String str, boolean z, wretchedly.dern<? super Unit> dernVar) {
        FcmActionHelper$performLanguageTopicRefresh$1 fcmActionHelper$performLanguageTopicRefresh$1;
        Set<String> setMarial;
        String str2;
        Throwable th;
        Set<String> set;
        LanguageTopicInfo languageTopicInfoMarial;
        Set<String> set2;
        boolean zBooleanValue;
        Object objAttabal;
        Set<String> set3;
        LanguageTopicInfo languageTopicInfo;
        Set<String> set4;
        String str3;
        boolean z2;
        LanguageTopicInfo languageTopicInfo2;
        String str4;
        String message;
        String str5;
        if (dernVar instanceof FcmActionHelper$performLanguageTopicRefresh$1) {
            fcmActionHelper$performLanguageTopicRefresh$1 = (FcmActionHelper$performLanguageTopicRefresh$1) dernVar;
            int i = fcmActionHelper$performLanguageTopicRefresh$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fcmActionHelper$performLanguageTopicRefresh$1.label = i - Integer.MIN_VALUE;
            } else {
                fcmActionHelper$performLanguageTopicRefresh$1 = new FcmActionHelper$performLanguageTopicRefresh$1(this, dernVar);
            }
        } else {
            fcmActionHelper$performLanguageTopicRefresh$1 = new FcmActionHelper$performLanguageTopicRefresh$1(this, dernVar);
        }
        Object obj = fcmActionHelper$performLanguageTopicRefresh$1.result;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = fcmActionHelper$performLanguageTopicRefresh$1.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    z = fcmActionHelper$performLanguageTopicRefresh$1.Z$0;
                    LanguageTopicInfo languageTopicInfo3 = (LanguageTopicInfo) fcmActionHelper$performLanguageTopicRefresh$1.L$3;
                    setMarial = (Set) fcmActionHelper$performLanguageTopicRefresh$1.L$2;
                    set2 = (Set) fcmActionHelper$performLanguageTopicRefresh$1.L$1;
                    str5 = (String) fcmActionHelper$performLanguageTopicRefresh$1.L$0;
                    try {
                        p002kotlin.dern.saneness(obj);
                        languageTopicInfoMarial = languageTopicInfo3;
                        str = str5;
                        try {
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            Task<String> taskMolybdenite = FirebaseMessaging.arytenoidectomy().molybdenite();
                            Intrinsics.checkNotNullExpressionValue(taskMolybdenite, "getToken(...)");
                            fcmActionHelper$performLanguageTopicRefresh$1.L$0 = str;
                            fcmActionHelper$performLanguageTopicRefresh$1.L$1 = set2;
                            fcmActionHelper$performLanguageTopicRefresh$1.L$2 = setMarial;
                            fcmActionHelper$performLanguageTopicRefresh$1.L$3 = languageTopicInfoMarial;
                            fcmActionHelper$performLanguageTopicRefresh$1.Z$0 = z;
                            fcmActionHelper$performLanguageTopicRefresh$1.Z$1 = zBooleanValue;
                            fcmActionHelper$performLanguageTopicRefresh$1.label = 2;
                            objAttabal = coreopsis.saneness.attabal(taskMolybdenite, fcmActionHelper$performLanguageTopicRefresh$1);
                            if (objAttabal != objBeachfront) {
                                Set<String> set5 = set2;
                                set3 = setMarial;
                                languageTopicInfo = languageTopicInfoMarial;
                                set4 = set5;
                                str3 = (String) objAttabal;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                if (str3.length() <= 0) {
                                    throw new IllegalArgumentException("fcm_token_empty");
                                }
                                fcmActionHelper$performLanguageTopicRefresh$1.L$0 = str;
                                fcmActionHelper$performLanguageTopicRefresh$1.L$1 = set4;
                                fcmActionHelper$performLanguageTopicRefresh$1.L$2 = set3;
                                fcmActionHelper$performLanguageTopicRefresh$1.L$3 = languageTopicInfo;
                                fcmActionHelper$performLanguageTopicRefresh$1.L$4 = str3;
                                fcmActionHelper$performLanguageTopicRefresh$1.Z$0 = z;
                                fcmActionHelper$performLanguageTopicRefresh$1.Z$1 = zBooleanValue;
                                fcmActionHelper$performLanguageTopicRefresh$1.label = 3;
                                if (formularize(str3, languageTopicInfo, fcmActionHelper$performLanguageTopicRefresh$1) != objBeachfront) {
                                    str2 = str;
                                    z2 = zBooleanValue;
                                    languageTopicInfo2 = languageTopicInfo;
                                    str4 = str3;
                                    setMarial = set3;
                                    set = set4;
                                    tau.saneness sanenessVar = tau.saneness.f38666attabal;
                                    sanenessVar.restrictive(languageTopicInfo2.marial());
                                    String strSaneness = com.blankj.utilcode.util.competently.saneness(str4);
                                    Intrinsics.checkNotNullExpressionValue(strSaneness, "encryptMD5ToString(...)");
                                    sanenessVar.supplicat(strSaneness);
                                    if (z2) {
                                        message = "request_success";
                                    } else {
                                        message = "topic_no_change";
                                    }
                                }
                            }
                            return objBeachfront;
                        } catch (Throwable th2) {
                            str2 = str;
                            th = th2;
                            set = set2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        set = set2;
                        str2 = str5;
                    }
                } else if (i2 == 2) {
                    boolean z3 = fcmActionHelper$performLanguageTopicRefresh$1.Z$1;
                    z = fcmActionHelper$performLanguageTopicRefresh$1.Z$0;
                    languageTopicInfo = (LanguageTopicInfo) fcmActionHelper$performLanguageTopicRefresh$1.L$3;
                    Set<String> set6 = (Set) fcmActionHelper$performLanguageTopicRefresh$1.L$2;
                    set2 = (Set) fcmActionHelper$performLanguageTopicRefresh$1.L$1;
                    str5 = (String) fcmActionHelper$performLanguageTopicRefresh$1.L$0;
                    try {
                        p002kotlin.dern.saneness(obj);
                        zBooleanValue = z3;
                        str = str5;
                        set4 = set2;
                        set3 = set6;
                        objAttabal = obj;
                        try {
                            str3 = (String) objAttabal;
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (str3.length() <= 0) {
                                throw new IllegalArgumentException("fcm_token_empty");
                            }
                            fcmActionHelper$performLanguageTopicRefresh$1.L$0 = str;
                            fcmActionHelper$performLanguageTopicRefresh$1.L$1 = set4;
                            fcmActionHelper$performLanguageTopicRefresh$1.L$2 = set3;
                            fcmActionHelper$performLanguageTopicRefresh$1.L$3 = languageTopicInfo;
                            fcmActionHelper$performLanguageTopicRefresh$1.L$4 = str3;
                            fcmActionHelper$performLanguageTopicRefresh$1.Z$0 = z;
                            fcmActionHelper$performLanguageTopicRefresh$1.Z$1 = zBooleanValue;
                            fcmActionHelper$performLanguageTopicRefresh$1.label = 3;
                            if (formularize(str3, languageTopicInfo, fcmActionHelper$performLanguageTopicRefresh$1) != objBeachfront) {
                                str2 = str;
                                z2 = zBooleanValue;
                                languageTopicInfo2 = languageTopicInfo;
                                str4 = str3;
                                setMarial = set3;
                                set = set4;
                                tau.saneness sanenessVar2 = tau.saneness.f38666attabal;
                                sanenessVar2.restrictive(languageTopicInfo2.marial());
                                String strSaneness2 = com.blankj.utilcode.util.competently.saneness(str4);
                                Intrinsics.checkNotNullExpressionValue(strSaneness2, "encryptMD5ToString(...)");
                                sanenessVar2.supplicat(strSaneness2);
                                if (z2) {
                                    message = "request_success";
                                } else {
                                    message = "topic_no_change";
                                }
                            }
                            return objBeachfront;
                        } catch (Throwable th4) {
                            str2 = str;
                            th = th4;
                            setMarial = set3;
                            set = set4;
                            message = th.getMessage();
                            if (message == null) {
                                message = "unknown_error";
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        setMarial = set6;
                        set = set2;
                        str2 = str5;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = fcmActionHelper$performLanguageTopicRefresh$1.Z$1;
                    str4 = (String) fcmActionHelper$performLanguageTopicRefresh$1.L$4;
                    languageTopicInfo2 = (LanguageTopicInfo) fcmActionHelper$performLanguageTopicRefresh$1.L$3;
                    setMarial = (Set) fcmActionHelper$performLanguageTopicRefresh$1.L$2;
                    set = (Set) fcmActionHelper$performLanguageTopicRefresh$1.L$1;
                    str2 = (String) fcmActionHelper$performLanguageTopicRefresh$1.L$0;
                    try {
                        p002kotlin.dern.saneness(obj);
                        tau.saneness sanenessVar3 = tau.saneness.f38666attabal;
                        sanenessVar3.restrictive(languageTopicInfo2.marial());
                        String strSaneness3 = com.blankj.utilcode.util.competently.saneness(str4);
                        Intrinsics.checkNotNullExpressionValue(strSaneness3, "encryptMD5ToString(...)");
                        sanenessVar3.supplicat(strSaneness3);
                        if (z2) {
                            message = "request_success";
                        } else {
                            message = "topic_no_change";
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        message = th.getMessage();
                        if (message == null) {
                            message = "unknown_error";
                        }
                    }
                }
                set = set2;
                str2 = str5;
                message = th.getMessage();
                if (message == null) {
                    message = "unknown_error";
                }
            } else {
                p002kotlin.dern.saneness(obj);
                Set<String> setMarial2 = creditor.marial();
                setMarial = creditor.marial();
                try {
                    languageTopicInfoMarial = marial();
                    setMarial2 = tau.saneness.f38666attabal.taiyuan();
                    setMarial = languageTopicInfoMarial.marial();
                    fcmActionHelper$performLanguageTopicRefresh$1.L$0 = str;
                    fcmActionHelper$performLanguageTopicRefresh$1.L$1 = setMarial2;
                    fcmActionHelper$performLanguageTopicRefresh$1.L$2 = setMarial;
                    fcmActionHelper$performLanguageTopicRefresh$1.L$3 = languageTopicInfoMarial;
                    fcmActionHelper$performLanguageTopicRefresh$1.Z$0 = z;
                    fcmActionHelper$performLanguageTopicRefresh$1.label = 1;
                    Object objKowloon = kowloon(setMarial2, setMarial, z, fcmActionHelper$performLanguageTopicRefresh$1);
                    if (objKowloon != objBeachfront) {
                        set2 = setMarial2;
                        obj = objKowloon;
                        zBooleanValue = ((Boolean) obj).booleanValue();
                        Task<String> taskMolybdenite2 = FirebaseMessaging.arytenoidectomy().molybdenite();
                        Intrinsics.checkNotNullExpressionValue(taskMolybdenite2, "getToken(...)");
                        fcmActionHelper$performLanguageTopicRefresh$1.L$0 = str;
                        fcmActionHelper$performLanguageTopicRefresh$1.L$1 = set2;
                        fcmActionHelper$performLanguageTopicRefresh$1.L$2 = setMarial;
                        fcmActionHelper$performLanguageTopicRefresh$1.L$3 = languageTopicInfoMarial;
                        fcmActionHelper$performLanguageTopicRefresh$1.Z$0 = z;
                        fcmActionHelper$performLanguageTopicRefresh$1.Z$1 = zBooleanValue;
                        fcmActionHelper$performLanguageTopicRefresh$1.label = 2;
                        objAttabal = coreopsis.saneness.attabal(taskMolybdenite2, fcmActionHelper$performLanguageTopicRefresh$1);
                        if (objAttabal != objBeachfront) {
                            Set<String> set7 = set2;
                            set3 = setMarial;
                            languageTopicInfo = languageTopicInfoMarial;
                            set4 = set7;
                            str3 = (String) objAttabal;
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (str3.length() <= 0) {
                                throw new IllegalArgumentException("fcm_token_empty");
                            }
                            fcmActionHelper$performLanguageTopicRefresh$1.L$0 = str;
                            fcmActionHelper$performLanguageTopicRefresh$1.L$1 = set4;
                            fcmActionHelper$performLanguageTopicRefresh$1.L$2 = set3;
                            fcmActionHelper$performLanguageTopicRefresh$1.L$3 = languageTopicInfo;
                            fcmActionHelper$performLanguageTopicRefresh$1.L$4 = str3;
                            fcmActionHelper$performLanguageTopicRefresh$1.Z$0 = z;
                            fcmActionHelper$performLanguageTopicRefresh$1.Z$1 = zBooleanValue;
                            fcmActionHelper$performLanguageTopicRefresh$1.label = 3;
                            if (formularize(str3, languageTopicInfo, fcmActionHelper$performLanguageTopicRefresh$1) != objBeachfront) {
                                str2 = str;
                                z2 = zBooleanValue;
                                languageTopicInfo2 = languageTopicInfo;
                                str4 = str3;
                                setMarial = set3;
                                set = set4;
                                tau.saneness sanenessVar4 = tau.saneness.f38666attabal;
                                sanenessVar4.restrictive(languageTopicInfo2.marial());
                                String strSaneness4 = com.blankj.utilcode.util.competently.saneness(str4);
                                Intrinsics.checkNotNullExpressionValue(strSaneness4, "encryptMD5ToString(...)");
                                sanenessVar4.supplicat(strSaneness4);
                                if (z2) {
                                    message = "request_success";
                                } else {
                                    message = "topic_no_change";
                                }
                            }
                        }
                    }
                    return objBeachfront;
                } catch (Throwable th7) {
                    str2 = str;
                    th = th7;
                    set = setMarial2;
                }
            }
            com.codejoy.boom.clap.helper.dern.f18260attabal.saneness("SmartPush", "刷新主题结束：来源=" + str2 + "，结果=" + message + "，旧=" + set + "，新=" + setMarial);
            return Unit.f29295attabal;
        } catch (CancellationException e) {
            throw e;
        }
    }

    public final Object triweekly(wretchedly.dern<? super Unit> dernVar) {
        Object objTaiyuan = taiyuan("package_replaced", false, dernVar);
        return objTaiyuan == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objTaiyuan : Unit.f29295attabal;
    }
}
