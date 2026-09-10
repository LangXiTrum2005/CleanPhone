package transformable;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.common.base.dern;
import com.google.common.collect.ImmutableList;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import decarock.grimness;
import decarock.impromptu;
import decarock.stratoscope;
import decarock.triweekly;
import java.nio.charset.Charset;
import java.util.List;
import org.jacoco.core.runtime.RemoteControlWriter;
import strother.marial;
import strother.polloi;

/* JADX INFO: compiled from: Tx3gParser.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements polloi {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final stratoscope f38909attabal = new stratoscope();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final float f38910beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final int f38911competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final int f38912dern;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final String f38913marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final boolean f38914saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f38915wireman;

    public attabal(List<byte[]> list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f38912dern = 0;
            this.f38915wireman = -1;
            this.f38913marial = C.SANS_SERIF_NAME;
            this.f38914saneness = false;
            this.f38910beachfront = 0.85f;
            this.f38911competently = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f38912dern = bArr[24];
        this.f38915wireman = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.f38913marial = "Serif".equals(grimness.supplicat(bArr, 43, bArr.length - 43)) ? C.SERIF_NAME : str;
        int i = bArr[25] * 20;
        this.f38911competently = i;
        boolean z = (bArr[0] & RemoteControlWriter.BLOCK_CMDOK) != 0;
        this.f38914saneness = z;
        if (z) {
            this.f38910beachfront = grimness.triweekly(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
        } else {
            this.f38910beachfront = 0.85f;
        }
    }

    public static void beachfront(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    public static void competently(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    public static String impromptu(stratoscope stratoscopeVar) {
        decarock.attabal.attabal(stratoscopeVar.attabal() >= 2);
        int iSaran = stratoscopeVar.saran();
        if (iSaran == 0) {
            return "";
        }
        int iBeachfront = stratoscopeVar.beachfront();
        Charset charsetCreditor = stratoscopeVar.creditor();
        int iBeachfront2 = iSaran - (stratoscopeVar.beachfront() - iBeachfront);
        if (charsetCreditor == null) {
            charsetCreditor = dern.f21534dern;
        }
        return stratoscopeVar.sealless(iBeachfront2, charsetCreditor);
    }

    public static void marial(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    @Override // strother.polloi
    public int dern() {
        return 2;
    }

    @Override // strother.polloi
    public void saneness(byte[] bArr, int i, int i2, polloi.saneness sanenessVar, impromptu<marial> impromptuVar) {
        this.f38909attabal.walach(bArr, i2 + i);
        this.f38909attabal.mathsort(i);
        String strImpromptu = impromptu(this.f38909attabal);
        if (strImpromptu.isEmpty()) {
            impromptuVar.accept(new marial(ImmutableList.of(), C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strImpromptu);
        beachfront(spannableStringBuilder, this.f38912dern, 0, 0, spannableStringBuilder.length(), 16711680);
        marial(spannableStringBuilder, this.f38915wireman, -1, 0, spannableStringBuilder.length(), 16711680);
        competently(spannableStringBuilder, this.f38913marial, 0, spannableStringBuilder.length());
        float fTriweekly = this.f38910beachfront;
        while (this.f38909attabal.attabal() >= 8) {
            int iBeachfront = this.f38909attabal.beachfront();
            int iMonoploid = this.f38909attabal.monoploid();
            int iMonoploid2 = this.f38909attabal.monoploid();
            if (iMonoploid2 == 1937013100) {
                decarock.attabal.attabal(this.f38909attabal.attabal() >= 2);
                int iSaran = this.f38909attabal.saran();
                for (int i3 = 0; i3 < iSaran; i3++) {
                    wireman(this.f38909attabal, spannableStringBuilder);
                }
            } else if (iMonoploid2 == 1952608120 && this.f38914saneness) {
                decarock.attabal.attabal(this.f38909attabal.attabal() >= 2);
                fTriweekly = grimness.triweekly(this.f38909attabal.saran() / this.f38911competently, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
            }
            this.f38909attabal.mathsort(iBeachfront + iMonoploid);
        }
        impromptuVar.accept(new marial(ImmutableList.of(new libya.attabal.saneness().kowloon(spannableStringBuilder).impromptu(fTriweekly, 0).taiyuan(0).attabal()), C.TIME_UNSET, C.TIME_UNSET));
    }

    public final void wireman(stratoscope stratoscopeVar, SpannableStringBuilder spannableStringBuilder) {
        decarock.attabal.attabal(stratoscopeVar.attabal() >= 12);
        int iSaran = stratoscopeVar.saran();
        int iSaran2 = stratoscopeVar.saran();
        stratoscopeVar.splinterproof(2);
        int iSupplicat = stratoscopeVar.supplicat();
        stratoscopeVar.splinterproof(1);
        int iMonoploid = stratoscopeVar.monoploid();
        if (iSaran2 > spannableStringBuilder.length()) {
            triweekly.impromptu("Tx3gParser", "Truncating styl end (" + iSaran2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iSaran2 = spannableStringBuilder.length();
        }
        int i = iSaran2;
        if (iSaran < i) {
            beachfront(spannableStringBuilder, iSupplicat, this.f38912dern, iSaran, i, 0);
            marial(spannableStringBuilder, iMonoploid, this.f38915wireman, iSaran, i, 0);
            return;
        }
        triweekly.impromptu("Tx3gParser", "Ignoring styl with start (" + iSaran + ") >= end (" + i + ").");
    }
}
