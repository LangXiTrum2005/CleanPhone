package androidx.media;

import java.util.Arrays;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4636a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4637b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4638c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4639d = -1;

    public final boolean equals(Object obj) {
        int i10;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f4637b == audioAttributesImplBase.f4637b) {
            int i11 = this.f4638c;
            int i12 = audioAttributesImplBase.f4638c;
            int i13 = audioAttributesImplBase.f4639d;
            if (i13 == -1) {
                int i14 = audioAttributesImplBase.f4636a;
                int i15 = AudioAttributesCompat.f4632b;
                if ((i12 & 1) != 1) {
                    i10 = 4;
                    if ((i12 & 4) != 4) {
                        switch (i14) {
                            case 2:
                                i10 = 0;
                                break;
                            case 3:
                                i10 = 8;
                                break;
                            case 4:
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i10 = 5;
                                break;
                            case 6:
                                i10 = 2;
                                break;
                            case 11:
                                i10 = 10;
                                break;
                            case 12:
                            default:
                                i10 = 3;
                                break;
                            case 13:
                                i10 = 1;
                                break;
                        }
                    } else {
                        i10 = 6;
                    }
                } else {
                    i10 = 7;
                }
            } else {
                i10 = i13;
            }
            if (i10 == 6) {
                i12 |= 4;
            } else if (i10 == 7) {
                i12 |= 1;
            }
            if (i11 == (i12 & 273) && this.f4636a == audioAttributesImplBase.f4636a && this.f4639d == i13) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4637b), Integer.valueOf(this.f4638c), Integer.valueOf(this.f4636a), Integer.valueOf(this.f4639d)});
    }

    public final String toString() {
        String strE;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f4639d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f4639d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i10 = this.f4636a;
        int i11 = AudioAttributesCompat.f4632b;
        switch (i10) {
            case 0:
                strE = "USAGE_UNKNOWN";
                break;
            case 1:
                strE = "USAGE_MEDIA";
                break;
            case 2:
                strE = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strE = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strE = "USAGE_ALARM";
                break;
            case 5:
                strE = "USAGE_NOTIFICATION";
                break;
            case 6:
                strE = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strE = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strE = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strE = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strE = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strE = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strE = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strE = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strE = "USAGE_GAME";
                break;
            case 15:
            default:
                strE = d.e(i10, "unknown usage ");
                break;
            case 16:
                strE = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strE);
        sb2.append(" content=");
        sb2.append(this.f4637b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f4638c).toUpperCase());
        return sb2.toString();
    }
}
