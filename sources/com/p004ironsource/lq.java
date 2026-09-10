package com.p004ironsource;

import androidx.datastore.preferences.protobuf.a;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.m3.h;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.y4.g;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b(\u0010)J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003JI\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0005\u0010\u0019R\"\u0010\r\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u0003\u0010\u001dR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018\"\u0004\b\u0003\u0010\u0019R\"\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\u0003\u0010\"R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\u0005\u0010&R$\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010#\u001a\u0004\b'\u0010%\"\u0004\b\u0003\u0010&¨\u0006*"}, d2 = {"Lcom/ironsource/lq;", "", "", "a", "", "b", "c", "", "d", "", "e", f.j, "pixelEventsEnabled", "pixelEventsUrl", "pixelEventsCompression", "pixelEventsCompressionLevel", "pixelOptOut", "pixelOptIn", "toString", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "equals", "Z", i.f37957c, "()Z", "(Z)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "(Ljava/lang/String;)V", g.f40227p, "I", h.f36614b, "()I", "(I)V", "[I", "l", "()[I", "([I)V", "k", "<init>", "(ZLjava/lang/String;ZI[I[I)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class lq {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean pixelEventsEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String pixelEventsUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean pixelEventsCompression;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int pixelEventsCompressionLevel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int[] pixelOptOut;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int[] pixelOptIn;

    public lq() {
        this(false, null, false, 0, null, null, 63, null);
    }

    public static /* synthetic */ lq a(lq lqVar, boolean z2, String str, boolean z3, int i2, int[] iArr, int[] iArr2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z2 = lqVar.pixelEventsEnabled;
        }
        if ((i3 & 2) != 0) {
            str = lqVar.pixelEventsUrl;
        }
        if ((i3 & 4) != 0) {
            z3 = lqVar.pixelEventsCompression;
        }
        if ((i3 & 8) != 0) {
            i2 = lqVar.pixelEventsCompressionLevel;
        }
        if ((i3 & 16) != 0) {
            iArr = lqVar.pixelOptOut;
        }
        if ((i3 & 32) != 0) {
            iArr2 = lqVar.pixelOptIn;
        }
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        return lqVar.a(z2, str, z3, i2, iArr3, iArr4);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getPixelEventsUrl() {
        return this.pixelEventsUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getPixelEventsCompression() {
        return this.pixelEventsCompression;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPixelEventsCompressionLevel() {
        return this.pixelEventsCompressionLevel;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int[] getPixelOptOut() {
        return this.pixelOptOut;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof lq)) {
            return false;
        }
        lq lqVar = (lq) other;
        return this.pixelEventsEnabled == lqVar.pixelEventsEnabled && Intrinsics.a(this.pixelEventsUrl, lqVar.pixelEventsUrl) && this.pixelEventsCompression == lqVar.pixelEventsCompression && this.pixelEventsCompressionLevel == lqVar.pixelEventsCompressionLevel && Intrinsics.a(this.pixelOptOut, lqVar.pixelOptOut) && Intrinsics.a(this.pixelOptIn, lqVar.pixelOptIn);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int[] getPixelOptIn() {
        return this.pixelOptIn;
    }

    public final boolean g() {
        return this.pixelEventsCompression;
    }

    public final int h() {
        return this.pixelEventsCompressionLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public int hashCode() {
        boolean z2 = this.pixelEventsEnabled;
        ?? r0 = z2;
        if (z2) {
            r0 = 1;
        }
        int iB = a.b(this.pixelEventsUrl, r0 * 31, 31);
        boolean z3 = this.pixelEventsCompression;
        int iA = androidx.media3.extractor.text.ttml.a.a(this.pixelEventsCompressionLevel, (iB + (z3 ? 1 : z3)) * 31, 31);
        int[] iArr = this.pixelOptOut;
        int iHashCode = (iA + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        int[] iArr2 = this.pixelOptIn;
        return iHashCode + (iArr2 != null ? Arrays.hashCode(iArr2) : 0);
    }

    public final boolean i() {
        return this.pixelEventsEnabled;
    }

    public final String j() {
        return this.pixelEventsUrl;
    }

    public final int[] k() {
        return this.pixelOptIn;
    }

    public final int[] l() {
        return this.pixelOptOut;
    }

    public String toString() {
        return "PixelSettings(pixelEventsEnabled=" + this.pixelEventsEnabled + ", pixelEventsUrl=" + this.pixelEventsUrl + ", pixelEventsCompression=" + this.pixelEventsCompression + ", pixelEventsCompressionLevel=" + this.pixelEventsCompressionLevel + ", pixelOptOut=" + Arrays.toString(this.pixelOptOut) + ", pixelOptIn=" + Arrays.toString(this.pixelOptIn) + ')';
    }

    public lq(boolean z2, String pixelEventsUrl, boolean z3, int i2, int[] iArr, int[] iArr2) {
        Intrinsics.f(pixelEventsUrl, "pixelEventsUrl");
        this.pixelEventsEnabled = z2;
        this.pixelEventsUrl = pixelEventsUrl;
        this.pixelEventsCompression = z3;
        this.pixelEventsCompressionLevel = i2;
        this.pixelOptOut = iArr;
        this.pixelOptIn = iArr2;
    }

    public final lq a(boolean pixelEventsEnabled, String pixelEventsUrl, boolean pixelEventsCompression, int pixelEventsCompressionLevel, int[] pixelOptOut, int[] pixelOptIn) {
        Intrinsics.f(pixelEventsUrl, "pixelEventsUrl");
        return new lq(pixelEventsEnabled, pixelEventsUrl, pixelEventsCompression, pixelEventsCompressionLevel, pixelOptOut, pixelOptIn);
    }

    public final void b(boolean z2) {
        this.pixelEventsEnabled = z2;
    }

    public /* synthetic */ lq(boolean z2, String str, boolean z3, int i2, int[] iArr, int[] iArr2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? true : z2, (i3 & 2) != 0 ? mq.f26191a : str, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? -1 : i2, (i3 & 16) != 0 ? null : iArr, (i3 & 32) != 0 ? null : iArr2);
    }

    public final void a(int i2) {
        this.pixelEventsCompressionLevel = i2;
    }

    public final void b(int[] iArr) {
        this.pixelOptOut = iArr;
    }

    public final void a(String str) {
        Intrinsics.f(str, "<set-?>");
        this.pixelEventsUrl = str;
    }

    public final void a(boolean z2) {
        this.pixelEventsCompression = z2;
    }

    public final void a(int[] iArr) {
        this.pixelOptIn = iArr;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getPixelEventsEnabled() {
        return this.pixelEventsEnabled;
    }
}
