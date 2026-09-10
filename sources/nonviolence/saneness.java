package nonviolence;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DateUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnonviolence/saneness;", "", "<init>", "()V", "", "dateFormat", "dern", "(Ljava/lang/String;)Ljava/lang/String;", "", TtmlNode.TAG_STYLE, "wireman", "(I)Ljava/lang/String;", "gmtFormat", "attabal", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljava/text/SimpleDateFormat;", "saneness", "(Ljava/lang/String;)Ljava/text/SimpleDateFormat;", "tools_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class saneness {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f33955attabal = new saneness();

    public static final String attabal(String gmtFormat, String dateFormat) {
        Intrinsics.checkNotNullParameter(gmtFormat, "gmtFormat");
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        SimpleDateFormat simpleDateFormatSaneness = f33955attabal.saneness(dateFormat);
        simpleDateFormatSaneness.setTimeZone(TimeZone.getTimeZone(gmtFormat));
        String str = simpleDateFormatSaneness.format(new Date());
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final String dern(String dateFormat) {
        Intrinsics.checkNotNullParameter(dateFormat, "dateFormat");
        return attabal(marial(0, 1, null), dateFormat);
    }

    public static /* synthetic */ String marial(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return wireman(i);
    }

    public static final String wireman(int style) {
        if (style == 2) {
            return String.valueOf(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 3600000);
        }
        String displayName = TimeZone.getDefault().getDisplayName(true, style, Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(displayName, "getDisplayName(...)");
        return displayName;
    }

    public final SimpleDateFormat saneness(String dateFormat) {
        return new SimpleDateFormat(dateFormat, Locale.getDefault());
    }
}
