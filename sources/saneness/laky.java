package saneness;

import ads_mobile_sdk.dp0;
import ads_mobile_sdk.ep0;
import ads_mobile_sdk.fp0;
import ads_mobile_sdk.ip0;
import ads_mobile_sdk.j13;
import ads_mobile_sdk.tn0;
import ads_mobile_sdk.un0;
import ads_mobile_sdk.w03;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.Settings;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.sequences.Sequence;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import p002kotlin.text.Charsets;
import p002kotlin.text.MatchResult;
import p002kotlin.text.Regex;
import p002kotlin.text.StringsKt;
import p002kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class laky {
    public static long attabal(amphitheatre timestampToElapsedRealTime, long j) {
        Intrinsics.checkNotNullParameter(timestampToElapsedRealTime, "$this$timestampToElapsedRealTime");
        timestampToElapsedRealTime.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return p002kotlin.time.dern.graveside(jElapsedRealtime - (jCurrentTimeMillis - j), DurationUnit.MILLISECONDS);
    }

    public static Map beachfront(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (uri.isOpaque()) {
            return p002kotlin.collections.seminary.taiyuan();
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        Sequence sequencePreprohormone = SequencesKt___SequencesKt.preprohormone(CollectionsKt.clubfoot(queryParameterNames), fp0.a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequencePreprohormone) {
            linkedHashMap.put(obj, uri.getQueryParameter((String) obj));
        }
        return linkedHashMap;
    }

    public static boolean competently(Context context, String permissionName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionName, "permissionName");
        return context.checkSelfPermission(permissionName) == 0;
    }

    public static String dern(Context context) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        AtomicReference atomicReference = ip0.g;
        String str = (String) atomicReference.get();
        if (str != null) {
            return str;
        }
        String strWireman = "B3EEABB8EE11C2BE770B684D95219ECB";
        if (!gnosis.attabal() && (string = Settings.Secure.getString(context.getContentResolver(), "android_id")) != null && string.length() != 0) {
            Intrinsics.beachfront(string);
            strWireman = wireman(string);
        }
        atomicReference.set(strWireman);
        return (String) atomicReference.get();
    }

    public static String marial(String regexString, String stringToMatch) {
        List<String> listSaneness;
        Intrinsics.checkNotNullParameter(regexString, "regexString");
        Intrinsics.checkNotNullParameter(stringToMatch, "stringToMatch");
        MatchResult matchResultFind$default = Regex.find$default(new Regex(regexString), stringToMatch, 0, 2, null);
        if (matchResultFind$default != null && (listSaneness = matchResultFind$default.saneness()) != null && listSaneness.size() >= 2) {
            int size = listSaneness.size();
            for (int i = 1; i < size; i++) {
                if (!StringsKt.empress(listSaneness.get(i))) {
                    return listSaneness.get(i);
                }
            }
        }
        return null;
    }

    public static String wireman(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                byte[] bytes = string.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                messageDigest.update(bytes);
                p002kotlin.jvm.internal.gintrap gintrapVar = p002kotlin.jvm.internal.gintrap.f29390attabal;
                String str = String.format(Locale.US, "%032X", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object saneness(long j, Function1 function1, wretchedly.dern dernVar) {
        dp0 dp0Var;
        if (dernVar instanceof dp0) {
            dp0Var = (dp0) dernVar;
            int i = dp0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dp0Var.c = i - Integer.MIN_VALUE;
            } else {
                dp0Var = new dp0(this, dernVar);
            }
        } else {
            dp0Var = new dp0(this, dernVar);
        }
        Object objWireman = dp0Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = dp0Var.c;
        int i3 = 1;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(objWireman);
                ep0 ep0Var = new ep0(function1, null);
                dp0Var.c = 1;
                objWireman = TimeoutKt.wireman(j, ep0Var, dp0Var);
                if (objWireman == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(objWireman);
            }
            return new tn0(objWireman);
        } catch (TimeoutCancellationException exception) {
            un0 un0Var = new un0(exception, i3);
            Intrinsics.checkNotNullParameter(exception, "exception");
            w03 w03VarA = j13.a();
            w03VarA.e().m = false;
            w03VarA.a(exception);
            return un0Var;
        }
    }
}
