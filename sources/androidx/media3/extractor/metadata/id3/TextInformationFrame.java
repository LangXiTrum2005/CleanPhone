package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new AnonymousClass1();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f6941Y;
    public final ImmutableList Z;

    /* JADX INFO: renamed from: androidx.media3.extractor.metadata.id3.TextInformationFrame$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            String string2 = parcel.readString();
            String[] strArrCreateStringArray = parcel.createStringArray();
            strArrCreateStringArray.getClass();
            return new TextInformationFrame(string, string2, ImmutableList.v(strArrCreateStringArray));
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame[] newArray(int i2) {
            return new TextInformationFrame[i2];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextInformationFrame(String str, String str2, List list) {
        super(str);
        Assertions.b(!((AbstractCollection) list).isEmpty());
        this.f6941Y = str2;
        ImmutableList immutableListU = ImmutableList.u(list);
        this.Z = immutableListU;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextInformationFrame.class == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (Util.a(this.X, textInformationFrame.X) && Util.a(this.f6941Y, textInformationFrame.f6941Y) && this.Z.equals(textInformationFrame.Z)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iB = a.b(this.X, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f6941Y;
        return this.Z.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.common.Metadata.Entry
    public final void n0(MediaMetadata.Builder builder) {
        byte b2;
        String str = this.X;
        str.getClass();
        ImmutableList immutableList = this.Z;
        switch (str) {
            case "TAL":
                b2 = 0;
                break;
            case "TCM":
                b2 = 1;
                break;
            case "TDA":
                b2 = 2;
                break;
            case "TP1":
                b2 = 3;
                break;
            case "TP2":
                b2 = 4;
                break;
            case "TP3":
                b2 = 5;
                break;
            case "TRK":
                b2 = 6;
                break;
            case "TT2":
                b2 = 7;
                break;
            case "TXT":
                b2 = 8;
                break;
            case "TYE":
                b2 = 9;
                break;
            case "TALB":
                b2 = 10;
                break;
            case "TCOM":
                b2 = 11;
                break;
            case "TCON":
                b2 = 12;
                break;
            case "TDAT":
                b2 = 13;
                break;
            case "TDRC":
                b2 = 14;
                break;
            case "TDRL":
                b2 = 15;
                break;
            case "TEXT":
                b2 = 16;
                break;
            case "TIT2":
                b2 = 17;
                break;
            case "TPE1":
                b2 = 18;
                break;
            case "TPE2":
                b2 = 19;
                break;
            case "TPE3":
                b2 = 20;
                break;
            case "TRCK":
                b2 = 21;
                break;
            case "TYER":
                b2 = 22;
                break;
            default:
                b2 = -1;
                break;
        }
        try {
            switch (b2) {
                case 0:
                case 10:
                    builder.f5478c = (CharSequence) immutableList.get(0);
                    break;
                case 1:
                case 11:
                    builder.s = (CharSequence) immutableList.get(0);
                    break;
                case 2:
                case 13:
                    String str2 = (String) immutableList.get(0);
                    int i2 = Integer.parseInt(str2.substring(2, 4));
                    int i3 = Integer.parseInt(str2.substring(0, 2));
                    builder.m = Integer.valueOf(i2);
                    builder.f5483n = Integer.valueOf(i3);
                    break;
                case 3:
                case 18:
                    builder.f5477b = (CharSequence) immutableList.get(0);
                    break;
                case 4:
                case 19:
                    builder.d = (CharSequence) immutableList.get(0);
                    break;
                case 5:
                case 20:
                    builder.t = (CharSequence) immutableList.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = (String) immutableList.get(0);
                    int i4 = Util.f5683a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i5 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    builder.f5480h = Integer.valueOf(i5);
                    builder.f5481i = numValueOf;
                    break;
                case 7:
                case 17:
                    builder.f5476a = (CharSequence) immutableList.get(0);
                    break;
                case 8:
                case 16:
                    builder.r = (CharSequence) immutableList.get(0);
                    break;
                case 9:
                case 22:
                    builder.f5482l = Integer.valueOf(Integer.parseInt((String) immutableList.get(0)));
                    break;
                case 12:
                    Integer numG = Ints.g((String) immutableList.get(0));
                    if (numG != null) {
                        String strA = Id3Util.a(numG.intValue());
                        if (strA != null) {
                            builder.f5485u = strA;
                        }
                    } else {
                        builder.f5485u = (CharSequence) immutableList.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListA = a((String) immutableList.get(0));
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                builder.f5483n = (Integer) arrayListA.get(2);
                            }
                        }
                        builder.m = (Integer) arrayListA.get(1);
                    }
                    builder.f5482l = (Integer) arrayListA.get(0);
                    break;
                case 15:
                    ArrayList arrayListA2 = a((String) immutableList.get(0));
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                builder.q = (Integer) arrayListA2.get(2);
                            }
                        }
                        builder.f5484p = (Integer) arrayListA2.get(1);
                    }
                    builder.o = (Integer) arrayListA2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.X + ": description=" + this.f6941Y + ": values=" + this.Z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.X);
        parcel.writeString(this.f6941Y);
        parcel.writeStringArray((String[]) this.Z.toArray(new String[0]));
    }
}
