package okhttp3;

import com.ironsource.C3414a2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ConnectionSpec.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0002\u001e\"B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0019\u0010)\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8G¢\u0006\u0006\u001a\u0004\b%\u0010(R\u0019\u0010,\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010&8G¢\u0006\u0006\u001a\u0004\b+\u0010(¨\u0006-"}, d2 = {"Lokhttp3/apical;", "", "", "isTls", "supportsTlsExtensions", "", "", "cipherSuitesAsString", "tlsVersionsAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "", "dern", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "marial", "(Ljavax/net/ssl/SSLSocket;)Z", C3414a2.d, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "competently", "(Ljavax/net/ssl/SSLSocket;Z)Lokhttp3/apical;", "attabal", "Z", "beachfront", "()Z", "saneness", "impromptu", "[Ljava/lang/String;", "wireman", "", "Lokhttp3/impromptu;", "()Ljava/util/List;", "cipherSuites", "Lokhttp3/TlsVersion;", "taiyuan", "tlsVersions", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class apical {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final apical f34121apical;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final impromptu[] f34122beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final impromptu[] f34123competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final apical f34124cutely;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final apical f34125impromptu;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public static final apical f34127taiyuan;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final boolean isTls;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final String[] cipherSuitesAsString;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final boolean supportsTlsExtensions;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final String[] tlsVersionsAsString;

    static {
        impromptu impromptuVar = impromptu.f34328incorrectly;
        impromptu impromptuVar2 = impromptu.f34322hyalinization;
        impromptu impromptuVar3 = impromptu.f34370puffin;
        impromptu impromptuVar4 = impromptu.f34369pruinose;
        impromptu impromptuVar5 = impromptu.f34386sultanate;
        impromptu impromptuVar6 = impromptu.f34390tarboosh;
        impromptu impromptuVar7 = impromptu.f34340linendraper;
        impromptu impromptuVar8 = impromptu.f34401vir;
        impromptu impromptuVar9 = impromptu.f34335liable;
        impromptu[] impromptuVarArr = {impromptuVar, impromptuVar2, impromptuVar3, impromptuVar4, impromptuVar5, impromptuVar6, impromptuVar7, impromptuVar8, impromptuVar9};
        f34122beachfront = impromptuVarArr;
        impromptu[] impromptuVarArr2 = {impromptuVar, impromptuVar2, impromptuVar3, impromptuVar4, impromptuVar5, impromptuVar6, impromptuVar7, impromptuVar8, impromptuVar9, impromptu.f34321homozygous, impromptu.f34333lampshade, impromptu.f34341lotta, impromptu.f34377sayid, impromptu.f34387supplicat, impromptu.f34379seminary, impromptu.f34314formularize};
        f34123competently = impromptuVarArr2;
        attabal attabalVarDern = new attabal(true).dern((impromptu[]) Arrays.copyOf(impromptuVarArr, impromptuVarArr.length));
        TlsVersion tlsVersion = TlsVersion.TLS_1_3;
        TlsVersion tlsVersion2 = TlsVersion.TLS_1_2;
        f34125impromptu = attabalVarDern.cutely(tlsVersion, tlsVersion2).impromptu(true).attabal();
        f34127taiyuan = new attabal(true).dern((impromptu[]) Arrays.copyOf(impromptuVarArr2, impromptuVarArr2.length)).cutely(tlsVersion, tlsVersion2).impromptu(true).attabal();
        f34124cutely = new attabal(true).dern((impromptu[]) Arrays.copyOf(impromptuVarArr2, impromptuVarArr2.length)).cutely(tlsVersion, tlsVersion2, TlsVersion.TLS_1_1, TlsVersion.TLS_1_0).impromptu(true).attabal();
        f34121apical = new attabal(false).attabal();
    }

    public apical(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.isTls = z;
        this.supportsTlsExtensions = z2;
        this.cipherSuitesAsString = strArr;
        this.tlsVersionsAsString = strArr2;
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final boolean getIsTls() {
        return this.isTls;
    }

    public final apical competently(SSLSocket sslSocket, boolean isFallback) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.cipherSuitesAsString != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = hereditist.wireman.yemenite(enabledCipherSuites, this.cipherSuitesAsString, impromptu.INSTANCE.dern());
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (this.tlsVersionsAsString != null) {
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = hereditist.wireman.yemenite(enabledProtocols, this.tlsVersionsAsString, frenchy.saneness.competently());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iRotuma = hereditist.wireman.rotuma(supportedCipherSuites, "TLS_FALLBACK_SCSV", impromptu.INSTANCE.dern());
        if (isFallback && iRotuma != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iRotuma];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = hereditist.wireman.kowloon(cipherSuitesIntersection, str);
        }
        attabal attabalVar = new attabal(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        attabal attabalVarSaneness = attabalVar.saneness((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return attabalVarSaneness.taiyuan((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).attabal();
    }

    public final void dern(SSLSocket sslSocket, boolean isFallback) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        apical apicalVarCompetently = competently(sslSocket, isFallback);
        if (apicalVarCompetently.taiyuan() != null) {
            sslSocket.setEnabledProtocols(apicalVarCompetently.tlsVersionsAsString);
        }
        if (apicalVarCompetently.wireman() != null) {
            sslSocket.setEnabledCipherSuites(apicalVarCompetently.cipherSuitesAsString);
        }
    }

    public boolean equals(Object other) {
        if (!(other instanceof apical)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        boolean z = this.isTls;
        apical apicalVar = (apical) other;
        if (z != apicalVar.isTls) {
            return false;
        }
        return !z || (Arrays.equals(this.cipherSuitesAsString, apicalVar.cipherSuitesAsString) && Arrays.equals(this.tlsVersionsAsString, apicalVar.tlsVersionsAsString) && this.supportsTlsExtensions == apicalVar.supportsTlsExtensions);
    }

    public int hashCode() {
        if (!this.isTls) {
            return 17;
        }
        String[] strArr = this.cipherSuitesAsString;
        int iHashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.tlsVersionsAsString;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.supportsTlsExtensions ? 1 : 0);
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final boolean getSupportsTlsExtensions() {
        return this.supportsTlsExtensions;
    }

    public final boolean marial(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.isTls) {
            return false;
        }
        String[] strArr = this.tlsVersionsAsString;
        if (strArr != null && !hereditist.wireman.adultoid(strArr, socket.getEnabledProtocols(), frenchy.saneness.competently())) {
            return false;
        }
        String[] strArr2 = this.cipherSuitesAsString;
        return strArr2 == null || hereditist.wireman.adultoid(strArr2, socket.getEnabledCipherSuites(), impromptu.INSTANCE.dern());
    }

    public final List<TlsVersion> taiyuan() {
        String[] strArr = this.tlsVersionsAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.INSTANCE.attabal(str));
        }
        return CollectionsKt.molet(arrayList);
    }

    public String toString() {
        if (!this.isTls) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + ((Object) Objects.toString(wireman(), "[all enabled]")) + ", tlsVersions=" + ((Object) Objects.toString(taiyuan(), "[all enabled]")) + ", supportsTlsExtensions=" + this.supportsTlsExtensions + ')';
    }

    public final List<impromptu> wireman() {
        String[] strArr = this.cipherSuitesAsString;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(impromptu.INSTANCE.saneness(str));
        }
        return CollectionsKt.molet(arrayList);
    }

    /* JADX INFO: compiled from: ConnectionSpec.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ!\u0010\f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\t\"\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\t\"\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\t\"\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u0005R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\"\u0010\u0016\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u0005¨\u0006("}, d2 = {"Lokhttp3/apical$attabal;", "", "", "tls", "<init>", "(Z)V", "Lokhttp3/apical;", "connectionSpec", "(Lokhttp3/apical;)V", "", "Lokhttp3/impromptu;", "cipherSuites", "dern", "([Lokhttp3/impromptu;)Lokhttp3/apical$attabal;", "", "saneness", "([Ljava/lang/String;)Lokhttp3/apical$attabal;", "Lokhttp3/TlsVersion;", "tlsVersions", "cutely", "([Lokhttp3/TlsVersion;)Lokhttp3/apical$attabal;", "taiyuan", "supportsTlsExtensions", "impromptu", "(Z)Lokhttp3/apical$attabal;", "attabal", "()Lokhttp3/apical;", "Z", "wireman", "()Z", "setTls$okhttp", "[Ljava/lang/String;", "getCipherSuites$okhttp", "()[Ljava/lang/String;", "marial", "([Ljava/lang/String;)V", "getTlsVersions$okhttp", "competently", "getSupportsTlsExtensions$okhttp", "beachfront", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public boolean tls;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public String[] tlsVersions;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public String[] cipherSuites;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public boolean supportsTlsExtensions;

        public attabal(boolean z) {
            this.tls = z;
        }

        public final apical attabal() {
            return new apical(this.tls, this.supportsTlsExtensions, this.cipherSuites, this.tlsVersions);
        }

        public final void beachfront(boolean z) {
            this.supportsTlsExtensions = z;
        }

        public final void competently(String[] strArr) {
            this.tlsVersions = strArr;
        }

        public final attabal cutely(TlsVersion... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!getTls()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.javaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return taiyuan((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final attabal dern(impromptu... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!getTls()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (impromptu impromptuVar : cipherSuites) {
                arrayList.add(impromptuVar.getJavaName());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return saneness((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        @patroclinal.wireman
        public final attabal impromptu(boolean supportsTlsExtensions) {
            if (!getTls()) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            beachfront(supportsTlsExtensions);
            return this;
        }

        public final void marial(String[] strArr) {
            this.cipherSuites = strArr;
        }

        public final attabal saneness(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!getTls()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            marial((String[]) cipherSuites.clone());
            return this;
        }

        public final attabal taiyuan(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!getTls()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            competently((String[]) tlsVersions.clone());
            return this;
        }

        /* JADX INFO: renamed from: wireman, reason: from getter */
        public final boolean getTls() {
            return this.tls;
        }

        public attabal(apical connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.tls = connectionSpec.getIsTls();
            this.cipherSuites = connectionSpec.cipherSuitesAsString;
            this.tlsVersions = connectionSpec.tlsVersionsAsString;
            this.supportsTlsExtensions = connectionSpec.getSupportsTlsExtensions();
        }
    }
}
