package bavaria;

import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.polloi;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import cybernatic.hydrovane;
import cybernatic.supplicat;
import decarock.stratoscope;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: compiled from: OpusReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class impromptu extends taiyuan {

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public boolean f14997triweekly;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final byte[] f14996kowloon = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static final byte[] f14995arytenoidectomy = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean kowloon(stratoscope stratoscopeVar) {
        return triweekly(stratoscopeVar, f14996kowloon);
    }

    public static boolean triweekly(stratoscope stratoscopeVar, byte[] bArr) {
        if (stratoscopeVar.attabal() < bArr.length) {
            return false;
        }
        int iBeachfront = stratoscopeVar.beachfront();
        byte[] bArr2 = new byte[bArr.length];
        stratoscopeVar.formularize(bArr2, 0, bArr.length);
        stratoscopeVar.mathsort(iBeachfront);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // bavaria.taiyuan
    public long beachfront(stratoscope stratoscopeVar) {
        return dern(supplicat.marial(stratoscopeVar.marial()));
    }

    @Override // bavaria.taiyuan
    public void formularize(boolean z) {
        super.formularize(z);
        if (z) {
            this.f14997triweekly = false;
        }
    }

    @Override // bavaria.taiyuan
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public boolean taiyuan(stratoscope stratoscopeVar, long j, taiyuan.saneness sanenessVar) throws ParserException {
        if (triweekly(stratoscopeVar, f14996kowloon)) {
            byte[] bArrCopyOf = Arrays.copyOf(stratoscopeVar.marial(), stratoscopeVar.competently());
            int iDern = supplicat.dern(bArrCopyOf);
            List<byte[]> listAttabal = supplicat.attabal(bArrCopyOf);
            if (sanenessVar.f15022attabal != null) {
                return true;
            }
            sanenessVar.f15022attabal = new polloi.saneness().sensatory(MimeTypes.AUDIO_OPUS).saran(iDern).underbelly(48000).premeiotic(listAttabal).polder();
            return true;
        }
        byte[] bArr = f14995arytenoidectomy;
        if (!triweekly(stratoscopeVar, bArr)) {
            decarock.attabal.taiyuan(sanenessVar.f15022attabal);
            return false;
        }
        decarock.attabal.taiyuan(sanenessVar.f15022attabal);
        if (this.f14997triweekly) {
            return true;
        }
        this.f14997triweekly = true;
        stratoscopeVar.splinterproof(bArr.length);
        Metadata metadataWireman = hydrovane.wireman(ImmutableList.copyOf(hydrovane.apical(stratoscopeVar, false, false).f24655saneness));
        if (metadataWireman == null) {
            return true;
        }
        sanenessVar.f15022attabal = sanenessVar.f15022attabal.attabal().lerp(metadataWireman.saneness(sanenessVar.f15022attabal.f11185apical)).polder();
        return true;
    }
}
