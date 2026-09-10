package okhttp3;

import androidx.datastore.preferences.protobuf.a;
import com.p004ironsource.x4;
import com.smartdigimkt.o1.b;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.network.core.OkHttp3Client;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.ByteString;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0003!\"#B!\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0000¢\u0006\u0002\b\u0014J)\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016\"\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018J\u001c\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0012J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0015\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006$"}, d2 = {"Lokhttp3/CertificatePinner;", "", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "getPins", "()Ljava/util/Set;", "check", "", "hostname", "", "cleanedPeerCertificatesFn", "Lkotlin/Function0;", "", "Ljava/security/cert/X509Certificate;", "check$okhttp", "peerCertificates", "", "Ljava/security/cert/Certificate;", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "findMatchingPins", "hashCode", "", "withCertificateChainCleaner", "withCertificateChainCleaner$okhttp", "Builder", "Companion", "Pin", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CertificatePinner {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b\"\u00020\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", b.y0, "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String pattern, String... pins) {
            Intrinsics.f(pattern, "pattern");
            Intrinsics.f(pins, "pins");
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(CollectionsKt.l0(this.pins), null, 2, 0 == true ? 1 : 0);
        }

        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\f\u0010\t\u001a\u00020\n*\u00020\u000bH\u0007J\f\u0010\f\u001a\u00020\n*\u00020\u000bH\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "()V", "DEFAULT", "Lokhttp3/CertificatePinner;", "pin", "", "certificate", "Ljava/security/cert/Certificate;", "sha1Hash", "Lokio/ByteString;", "Ljava/security/cert/X509Certificate;", "sha256Hash", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final String pin(Certificate certificate) {
            Intrinsics.f(certificate, "certificate");
            if (!(certificate instanceof X509Certificate)) {
                throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
            }
            return "sha256/" + sha256Hash((X509Certificate) certificate).d();
        }

        @JvmStatic
        public final ByteString sha1Hash(X509Certificate x509Certificate) {
            Intrinsics.f(x509Certificate, "<this>");
            ByteString byteString = ByteString.e0;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.e(encoded, "publicKey.encoded");
            return ByteString.Companion.d(encoded).g(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
        }

        @JvmStatic
        public final ByteString sha256Hash(X509Certificate x509Certificate) {
            Intrinsics.f(x509Certificate, "<this>");
            ByteString byteString = ByteString.e0;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            Intrinsics.e(encoded, "publicKey.encoded");
            return ByteString.Companion.d(encoded).g("SHA-256");
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0003J\b\u0010\u0018\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "pattern", "", "pin", "(Ljava/lang/String;Ljava/lang/String;)V", "hash", "Lokio/ByteString;", "getHash", "()Lokio/ByteString;", "hashAlgorithm", "getHashAlgorithm", "()Ljava/lang/String;", "getPattern", "equals", "", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "hashCode", "", "matchesCertificate", "certificate", "Ljava/security/cert/X509Certificate;", "matchesHostname", "hostname", "toString", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Pin {
        private final ByteString hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String pattern, String pin) {
            Intrinsics.f(pattern, "pattern");
            Intrinsics.f(pin, "pin");
            if ((!StringsKt.M(pattern, "*.", false) || StringsKt.v(pattern, "*", 1, false, 4) != -1) && ((!StringsKt.M(pattern, "**.", false) || StringsKt.v(pattern, "*", 2, false, 4) != -1) && StringsKt.v(pattern, "*", 0, false, 6) != -1)) {
                throw new IllegalArgumentException("Unexpected pattern: ".concat(pattern).toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(pattern);
            if (canonicalHost == null) {
                throw new IllegalArgumentException("Invalid pattern: ".concat(pattern));
            }
            this.pattern = canonicalHost;
            if (StringsKt.M(pin, "sha1/", false)) {
                this.hashAlgorithm = "sha1";
                ByteString byteString = ByteString.e0;
                String strSubstring = pin.substring(5);
                Intrinsics.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                ByteString byteStringA = ByteString.Companion.a(strSubstring);
                if (byteStringA == null) {
                    throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
                }
                this.hash = byteStringA;
                return;
            }
            if (!StringsKt.M(pin, "sha256/", false)) {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': ".concat(pin));
            }
            this.hashAlgorithm = "sha256";
            ByteString byteString2 = ByteString.e0;
            String strSubstring2 = pin.substring(7);
            Intrinsics.e(strSubstring2, "this as java.lang.String).substring(startIndex)");
            ByteString byteStringA2 = ByteString.Companion.a(strSubstring2);
            if (byteStringA2 == null) {
                throw new IllegalArgumentException("Invalid pin hash: ".concat(pin));
            }
            this.hash = byteStringA2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) other;
            return Intrinsics.a(this.pattern, pin.pattern) && Intrinsics.a(this.hashAlgorithm, pin.hashAlgorithm) && Intrinsics.a(this.hash, pin.hash);
        }

        public final ByteString getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return this.hash.hashCode() + a.b(this.hashAlgorithm, this.pattern.hashCode() * 31, 31);
        }

        public final boolean matchesCertificate(X509Certificate certificate) {
            Intrinsics.f(certificate, "certificate");
            String str = this.hashAlgorithm;
            if (Intrinsics.a(str, "sha256")) {
                return Intrinsics.a(this.hash, CertificatePinner.INSTANCE.sha256Hash(certificate));
            }
            if (Intrinsics.a(str, "sha1")) {
                return Intrinsics.a(this.hash, CertificatePinner.INSTANCE.sha1Hash(certificate));
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x006c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x006d A[RETURN] */
        public final boolean matchesHostname(String hostname) {
            Intrinsics.f(hostname, "hostname");
            if (StringsKt.M(this.pattern, "**.", false)) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                if (StringsKt.C(hostname, hostname.length() - length, this.pattern, 3, length, false) && (length2 == 0 || hostname.charAt(length2 - 1) == '.')) {
                    return true;
                }
                return false;
            }
            if (!StringsKt.M(this.pattern, "*.", false)) {
                return hostname.equals(this.pattern);
            }
            int length3 = this.pattern.length() - 1;
            int length4 = hostname.length() - length3;
            if (StringsKt.C(hostname, hostname.length() - length3, this.pattern, 1, length3, false) && StringsKt.z(hostname, '.', length4 - 1, 4) == -1) {
                return true;
            }
            return false;
        }

        public String toString() {
            return this.hashAlgorithm + IOUtils.DIR_SEPARATOR_UNIX + this.hash.d();
        }
    }

    public CertificatePinner(Set<Pin> pins, CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.f(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    @JvmStatic
    public static final String pin(Certificate certificate) {
        return INSTANCE.pin(certificate);
    }

    @JvmStatic
    public static final ByteString sha1Hash(X509Certificate x509Certificate) {
        return INSTANCE.sha1Hash(x509Certificate);
    }

    @JvmStatic
    public static final ByteString sha256Hash(X509Certificate x509Certificate) {
        return INSTANCE.sha256Hash(x509Certificate);
    }

    public final void check(final String hostname, final List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.f(hostname, "hostname");
        Intrinsics.f(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new Function0<List<? extends X509Certificate>>() { // from class: okhttp3.CertificatePinner.check.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<X509Certificate> invoke() {
                List<Certificate> listClean;
                CertificateChainCleaner certificateChainCleaner = CertificatePinner.this.getCertificateChainCleaner();
                if (certificateChainCleaner == null || (listClean = certificateChainCleaner.clean(peerCertificates, hostname)) == null) {
                    listClean = peerCertificates;
                }
                List<Certificate> list = listClean;
                ArrayList arrayList = new ArrayList(CollectionsKt.n(list, 10));
                for (Certificate certificate : list) {
                    Intrinsics.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            }
        });
    }

    public final void check$okhttp(String hostname, Function0<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) throws SSLPeerUnverifiedException {
        Intrinsics.f(hostname, "hostname");
        Intrinsics.f(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> listFindMatchingPins = findMatchingPins(hostname);
        if (listFindMatchingPins.isEmpty()) {
            return;
        }
        List<X509Certificate> list = (List) cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : list) {
            ByteString byteStringSha256Hash = null;
            ByteString byteStringSha1Hash = null;
            for (Pin pin : listFindMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (Intrinsics.a(hashAlgorithm, "sha256")) {
                    if (byteStringSha256Hash == null) {
                        byteStringSha256Hash = INSTANCE.sha256Hash(x509Certificate);
                    }
                    if (Intrinsics.a(pin.getHash(), byteStringSha256Hash)) {
                        return;
                    }
                } else {
                    if (!Intrinsics.a(hashAlgorithm, "sha1")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                    }
                    if (byteStringSha1Hash == null) {
                        byteStringSha1Hash = INSTANCE.sha1Hash(x509Certificate);
                    }
                    if (Intrinsics.a(pin.getHash(), byteStringSha1Hash)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : list) {
            sb.append("\n    ");
            sb.append(INSTANCE.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        for (Pin pin2 : listFindMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String string = sb.toString();
        Intrinsics.e(string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }

    public boolean equals(Object other) {
        if (!(other instanceof CertificatePinner)) {
            return false;
        }
        CertificatePinner certificatePinner = (CertificatePinner) other;
        return Intrinsics.a(certificatePinner.pins, this.pins) && Intrinsics.a(certificatePinner.certificateChainCleaner, this.certificateChainCleaner);
    }

    public final List<Pin> findMatchingPins(String hostname) {
        Intrinsics.f(hostname, "hostname");
        Set<Pin> set = this.pins;
        List arrayList = EmptyList.X;
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                TypeIntrinsics.a(arrayList).add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: getCertificateChainCleaner$okhttp, reason: from getter */
    public final CertificateChainCleaner getCertificateChainCleaner() {
        return this.certificateChainCleaner;
    }

    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int iHashCode = (this.pins.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        return iHashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner) {
        Intrinsics.f(certificateChainCleaner, "certificateChainCleaner");
        return Intrinsics.a(this.certificateChainCleaner, certificateChainCleaner) ? this : new CertificatePinner(this.pins, certificateChainCleaner);
    }

    @Deprecated
    public final void check(String hostname, Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        Intrinsics.f(hostname, "hostname");
        Intrinsics.f(peerCertificates, "peerCertificates");
        check(hostname, ArraysKt.M(peerCertificates));
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i2 & 2) != 0 ? null : certificateChainCleaner);
    }
}
