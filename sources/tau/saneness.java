package tau;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import babyless.beachfront;
import com.applovin.sdk.AppLovinEventTypes;
import com.codejoy.boom.clap.data.SoundData;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import incidentally.VersionResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.creditor;
import p002kotlin.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: SpCache.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0014J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\rJ\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\rJ\u0015\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u001e¢\u0006\u0004\b$\u0010 J\u0015\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u001e¢\u0006\u0004\b&\u0010#J\r\u0010'\u001a\u00020\u001e¢\u0006\u0004\b'\u0010 J\u0015\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001e¢\u0006\u0004\b)\u0010#J\u000f\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010*¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u0004\u0018\u00010*¢\u0006\u0004\b0\u0010,J\u0017\u00101\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010*¢\u0006\u0004\b1\u0010/J\u000f\u00102\u001a\u0004\u0018\u00010*¢\u0006\u0004\b2\u0010,J\u0017\u00103\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010*¢\u0006\u0004\b3\u0010/J\r\u00104\u001a\u00020\u000e¢\u0006\u0004\b4\u0010\u0010J\u0015\u00105\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b5\u0010\u0014J\r\u00106\u001a\u00020\u000e¢\u0006\u0004\b6\u0010\u0010J\u0015\u00107\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b7\u0010\u0014J\u0015\u00109\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u000b¢\u0006\u0004\b9\u0010\u001bJ\r\u0010:\u001a\u00020\u000b¢\u0006\u0004\b:\u0010\rJ\u0015\u0010;\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u000e¢\u0006\u0004\b=\u0010\u0010J\r\u0010>\u001a\u00020\u000e¢\u0006\u0004\b>\u0010\u0010J\u0015\u0010@\u001a\u00020\u00122\u0006\u0010?\u001a\u00020\u000e¢\u0006\u0004\b@\u0010\u0014J\r\u0010A\u001a\u00020\u0006¢\u0006\u0004\bA\u0010\nJ\u0015\u0010B\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u000e¢\u0006\u0004\bD\u0010\u0010J\u0015\u0010F\u001a\u00020\u00122\u0006\u0010E\u001a\u00020\u000e¢\u0006\u0004\bF\u0010\u0014J\r\u0010G\u001a\u00020\u000e¢\u0006\u0004\bG\u0010\u0010J\u0015\u0010H\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\bH\u0010\u0014J\r\u0010I\u001a\u00020\u000e¢\u0006\u0004\bI\u0010\u0010J\r\u0010J\u001a\u00020\u000e¢\u0006\u0004\bJ\u0010\u0010J\u000f\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u00122\u0006\u0010N\u001a\u00020K¢\u0006\u0004\bO\u0010PJ\u001b\u0010S\u001a\u00020\u00122\f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u000b0Q¢\u0006\u0004\bS\u0010TJ\u0013\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000b0Q¢\u0006\u0004\bU\u0010VR\u0017\u0010Y\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010W\u001a\u0004\bX\u0010\r¨\u0006Z"}, d2 = {"Ltau/saneness;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "apical", "(Landroid/content/Context;)J", "dern", "()J", "", "polloi", "()Ljava/lang/String;", "", "preprohormone", "()Z", "flag", "", "peridotite", "(Z)V", "gintrap", a.j, "trm", "saneness", "time", "oilcan", "(Ljava/lang/String;)V", "attabal", "stratoscope", "", "arytenoidectomy", "()I", AppLovinEventTypes.USER_COMPLETED_LEVEL, "saran", "(I)V", "triweekly", IronSourceConstants.EVENTS_DURATION, "seminary", "kowloon", "percent", "grimness", "Lcom/codejoy/boom/clap/data/SoundData;", "impassible", "()Lcom/codejoy/boom/clap/data/SoundData;", "soundBean", "polder", "(Lcom/codejoy/boom/clap/data/SoundData;)V", "monoploid", "privatdozent", "cutely", "merc", "cuirassed", "starveling", "cord", "yemenite", "token", "supplicat", "impromptu", "dovishness", "(Landroid/content/Context;)V", "rotuma", "wireman", "isClicked", "hydrovane", "competently", "kattegat", "(J)V", "formularize", "isFirst", "walach", "marial", "sealless", "graveside", "adultoid", "Lincidentally/attabal;", "molybdenite", "()Lincidentally/attabal;", "data", "creditor", "(Lincidentally/attabal;)V", "", "topics", "restrictive", "(Ljava/util/Set;)V", "taiyuan", "()Ljava/util/Set;", "Ljava/lang/String;", "beachfront", "KEY_SP_IS_VIP", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f38666attabal = new saneness();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final String KEY_SP_IS_VIP = "sp_key_iap_is_vip";

    public final boolean adultoid() {
        return beachfront.marial("sp_key_common_home_guide_step2", false);
    }

    public final long apical(Context context) {
        Object objM3351constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Long lValueOf = Long.valueOf((Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 0)).firstInstallTime);
            if (lValueOf.longValue() <= 0) {
                lValueOf = null;
            }
            objM3351constructorimpl = Result.m3351constructorimpl(Long.valueOf(lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(dern.attabal(th));
        }
        Long lValueOf2 = Long.valueOf(System.currentTimeMillis());
        if (Result.m3356isFailureimpl(objM3351constructorimpl)) {
            objM3351constructorimpl = lValueOf2;
        }
        return ((Number) objM3351constructorimpl).longValue();
    }

    public final int arytenoidectomy() {
        return beachfront.competently("sp_key_common_sound_sensitivity_level", 1);
    }

    public final String attabal() {
        String strTaiyuan = beachfront.taiyuan("sp_key_common_deactivate_end_time", "07:00");
        Intrinsics.checkNotNullExpressionValue(strTaiyuan, "getString(...)");
        return strTaiyuan;
    }

    public final String beachfront() {
        return KEY_SP_IS_VIP;
    }

    public final long competently() {
        return beachfront.impromptu("sp_key_common_fcm_last_show_time", 0L);
    }

    public final boolean cord() {
        return beachfront.marial("sp_key_common_notify_enable_flashlight", true);
    }

    public final void creditor(VersionResponse data) {
        Intrinsics.checkNotNullParameter(data, "data");
        beachfront.attabal("sp_key_common_version_info", data, null);
    }

    public final boolean cuirassed() {
        return beachfront.marial("sp_key_common_notify_enable_vibration", true);
    }

    public final SoundData cutely() {
        SoundData soundData = (SoundData) beachfront.beachfront("file_key_not_touch_notify_sounds", new SoundData(0, null, 0, false, 15, null), SoundData.class);
        return (soundData == null || soundData.getAudioFile().length() == 0) ? (SoundData) CollectionsKt.firstOrNull(unbalanced.attabal.f39224attabal.saneness()) : soundData;
    }

    public final long dern() {
        long jImpromptu = beachfront.impromptu("sp_key_common_fcm_install_time", 0L);
        if (jImpromptu != 0) {
            return jImpromptu;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        beachfront.apical("sp_key_common_fcm_install_time", Long.valueOf(jCurrentTimeMillis));
        return jCurrentTimeMillis;
    }

    public final void dovishness(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long jApical = apical(context);
        long jImpromptu = beachfront.impromptu("sp_key_common_fcm_install_time", 0L);
        if (jImpromptu == 0 || jImpromptu > jApical) {
            beachfront.apical("sp_key_common_fcm_install_time", Long.valueOf(jApical));
        }
    }

    public final boolean formularize() {
        return beachfront.marial("sp_key_common_recall_is_first_show", true);
    }

    public final boolean gintrap() {
        return beachfront.marial("sp_key_common_deactivate_feature_enable", false);
    }

    public final boolean graveside() {
        return beachfront.marial("sp_key_common_home_guide_step1", false);
    }

    public final void grimness(int percent) {
        beachfront.attabal("sp_key_common_sound_notify_volume", Integer.valueOf(percent), null);
    }

    public final void hydrovane(boolean isClicked) {
        beachfront.apical("sp_key_common_fcm_today_clicked", polloi() + "," + isClicked);
    }

    public final SoundData impassible() {
        SoundData soundData = (SoundData) beachfront.beachfront("file_key_notify_sounds", new SoundData(0, null, 0, false, 15, null), SoundData.class);
        return (soundData == null || soundData.getAudioFile().length() == 0) ? (SoundData) CollectionsKt.firstOrNull(unbalanced.attabal.f39224attabal.saneness()) : soundData;
    }

    public final String impromptu() {
        String strTaiyuan = beachfront.taiyuan("sp_key_common_last_token", "");
        Intrinsics.checkNotNullExpressionValue(strTaiyuan, "getString(...)");
        return strTaiyuan;
    }

    public final void kattegat(long time) {
        beachfront.apical("sp_key_common_fcm_last_show_time", Long.valueOf(time));
    }

    public final int kowloon() {
        return beachfront.competently("sp_key_common_sound_notify_volume", 50);
    }

    public final boolean marial() {
        return beachfront.marial("sp_key_common_has_rate_us", false);
    }

    public final void merc(SoundData soundBean) {
        if (soundBean != null) {
            beachfront.attabal("file_key_not_touch_notify_sounds", soundBean, null);
        }
    }

    public final VersionResponse molybdenite() {
        return (VersionResponse) beachfront.beachfront("sp_key_common_version_info", null, VersionResponse.class);
    }

    public final SoundData monoploid() {
        SoundData soundData = (SoundData) beachfront.beachfront("file_key_steal_notify_sounds", new SoundData(0, null, 0, false, 15, null), SoundData.class);
        return (soundData == null || soundData.getAudioFile().length() == 0) ? (SoundData) CollectionsKt.firstOrNull(unbalanced.attabal.f39224attabal.saneness()) : soundData;
    }

    public final void oilcan(String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        beachfront.attabal("sp_key_common_deactivate_start_time", time, null);
    }

    public final void peridotite(boolean flag) {
        beachfront.attabal("sp_key_common_first_open", Boolean.valueOf(flag), null);
    }

    public final void polder(SoundData soundBean) {
        if (soundBean != null) {
            beachfront.attabal("file_key_notify_sounds", soundBean, null);
        }
    }

    public final String polloi() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(1) + "-" + calendar.get(6);
    }

    public final boolean preprohormone() {
        return beachfront.marial("sp_key_common_first_open", true);
    }

    public final void privatdozent(SoundData soundBean) {
        if (soundBean != null) {
            beachfront.attabal("file_key_steal_notify_sounds", soundBean, null);
        }
    }

    public final void restrictive(Set<String> topics) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        beachfront.apical("sp_key_common_last_subscribed_fcm_topics", CollectionsKt.preterite(topics, ",", null, null, 0, null, null, 62, null));
    }

    public final boolean rotuma() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(f38666attabal.dern());
        calendar.add(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return System.currentTimeMillis() < calendar.getTimeInMillis();
    }

    public final String saneness() {
        String strTaiyuan = beachfront.taiyuan("sp_key_common_deactivate_start_time", "00:00");
        Intrinsics.checkNotNullExpressionValue(strTaiyuan, "getString(...)");
        return strTaiyuan;
    }

    public final void saran(int level) {
        beachfront.attabal("sp_key_common_sound_sensitivity_level", Integer.valueOf(level), null);
    }

    public final void sealless(boolean flag) {
        beachfront.attabal("sp_key_common_has_rate_us", Boolean.valueOf(flag), null);
    }

    public final void seminary(int duration) {
        beachfront.attabal("sp_key_common_sound_notify_duration", Integer.valueOf(duration), null);
    }

    public final void starveling(boolean enable) {
        beachfront.attabal("sp_key_common_notify_enable_vibration", Boolean.valueOf(enable), null);
    }

    public final void stratoscope(String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        beachfront.attabal("sp_key_common_deactivate_end_time", time, null);
    }

    public final void supplicat(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        beachfront.apical("sp_key_common_last_token", token);
    }

    public final Set<String> taiyuan() {
        String strTaiyuan = beachfront.taiyuan("sp_key_common_last_subscribed_fcm_topics", "");
        if (strTaiyuan == null || strTaiyuan.length() == 0) {
            return creditor.marial();
        }
        List listSplit$default = StringsKt.split$default(strTaiyuan, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (((String) obj).length() != 0) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.prefect(arrayList);
    }

    public final int triweekly() {
        return beachfront.competently("sp_key_common_sound_notify_duration", 5);
    }

    public final void trm(boolean enable) {
        beachfront.attabal("sp_key_common_deactivate_feature_enable", Boolean.valueOf(enable), null);
    }

    public final void walach(boolean isFirst) {
        beachfront.apical("sp_key_common_recall_is_first_show", Boolean.valueOf(isFirst));
    }

    public final boolean wireman() {
        String strTaiyuan = beachfront.taiyuan("sp_key_common_fcm_today_clicked", "");
        Intrinsics.checkNotNullExpressionValue(strTaiyuan, "getString(...)");
        List listSplit$default = StringsKt.split$default(strTaiyuan, new String[]{","}, false, 0, 6, null);
        return listSplit$default.size() == 2 && Intrinsics.wireman(listSplit$default.get(0), polloi()) && Boolean.parseBoolean((String) listSplit$default.get(1));
    }

    public final void yemenite(boolean enable) {
        beachfront.attabal("sp_key_common_notify_enable_flashlight", Boolean.valueOf(enable), null);
    }
}
