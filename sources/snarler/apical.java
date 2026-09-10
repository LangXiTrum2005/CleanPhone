package snarler;

import com.google.android.gms.common.util.BiConsumer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: ConfigGetParameterHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public class apical {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Set<BiConsumer<String, com.google.firebase.remoteconfig.internal.saneness>> f37639attabal = new HashSet();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final marial f37640dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Executor f37641saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final marial f37642wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Charset f37638marial = Charset.forName(C.UTF8_NAME);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Pattern f37636beachfront = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Pattern f37637competently = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    public apical(Executor executor, marial marialVar, marial marialVar2) {
        this.f37641saneness = executor;
        this.f37640dern = marialVar;
        this.f37642wireman = marialVar2;
    }

    public void attabal(BiConsumer<String, com.google.firebase.remoteconfig.internal.saneness> biConsumer) {
        synchronized (this.f37639attabal) {
            this.f37639attabal.add(biConsumer);
        }
    }
}
