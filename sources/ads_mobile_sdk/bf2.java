package ads_mobile_sdk;

import com.google.common.base.triweekly;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Locale;
import kotlinx.coroutines.channels.competently;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import okhttp3.dovishness;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.gintrap;
import p002kotlin.text.Charsets;
import saneness.adultoid;
import saneness.blighty;
import saneness.coffeecake;
import saneness.hobby;

/* JADX INFO: loaded from: classes.dex */
public abstract class bf2 {
    public final adultoid a;
    public final hobby b;
    public final jk0 c;
    public final blighty d;
    public iv e;
    public saran f;
    public vo g;
    public Object h;
    public final kotlinx.coroutines.channels.wireman i;
    public final LinkedList j;

    static {
        dovishness.INSTANCE.attabal(CommonGatewayClient.HEADER_PROTOBUF);
    }

    public bf2(coffeecake consentManagerProvider, hobby httpClient, jk0 flags, blighty userAgentProvider) {
        Intrinsics.checkNotNullParameter(consentManagerProvider, "consentManagerProvider");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
        this.a = consentManagerProvider;
        this.b = httpClient;
        this.c = flags;
        this.d = userAgentProvider;
        this.i = competently.saneness(0, null, null, 7, null);
        this.j = new LinkedList();
    }

    public static String a(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = string.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            gintrap gintrapVar = gintrap.f29390attabal;
            String str = String.format(Locale.US, "%032X", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    public abstract Object a(wretchedly.dern dernVar);

    public abstract boolean a();

    public abstract long b();

    public final void a(saran backgroundScope, xm0 baseMessage, vo chromeVariationsProvider) {
        saran saranVar;
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(baseMessage, "baseMessage");
        Intrinsics.checkNotNullParameter(chromeVariationsProvider, "chromeVariationsProvider");
        Intrinsics.checkNotNullParameter(backgroundScope, "<set-?>");
        this.f = backgroundScope;
        Intrinsics.checkNotNullParameter(baseMessage, "<set-?>");
        this.h = baseMessage;
        Object obj = this.a.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        iv ivVar = (iv) obj;
        Intrinsics.checkNotNullParameter(ivVar, "<set-?>");
        this.e = ivVar;
        Intrinsics.checkNotNullParameter(chromeVariationsProvider, "<set-?>");
        this.g = chromeVariationsProvider;
        saran saranVar2 = this.f;
        if (saranVar2 != null) {
            saranVar = saranVar2;
        } else {
            Intrinsics.preprohormone("backgroundScope");
            saranVar = null;
        }
        af2 block = new af2(this, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
    }

    public final void a(Object snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        synchronized (this) {
            this.j.add(snapshot);
        }
        if (a()) {
            this.i.triweekly(Unit.f29295attabal);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(byte[] bArr, wretchedly.dern dernVar) {
        xe2 xe2Var;
        if (dernVar instanceof xe2) {
            xe2Var = (xe2) dernVar;
            int i = xe2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xe2Var.c = i - Integer.MIN_VALUE;
            } else {
                xe2Var = new xe2(this, dernVar);
            }
        } else {
            xe2Var = new xe2(this, dernVar);
        }
        Object obj = xe2Var.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = xe2Var.c;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj);
                xt0 xt0VarA = new wt0().a(this.c.Z()).b(CommonGatewayClient.HEADER_PROTOBUF, bArr).a();
                hobby hobbyVar = this.b;
                xe2Var.c = 1;
                if (hobby.saneness(hobbyVar, xt0VarA, null, xe2Var, 14) == objBeachfront) {
                    return objBeachfront;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(obj);
            }
        } catch (IOException e) {
            triweekly triweeklyVar = kn0.a;
            kn0.b("Failed to ping RCS payload: " + e, null);
        }
        return Unit.f29295attabal;
    }
}
