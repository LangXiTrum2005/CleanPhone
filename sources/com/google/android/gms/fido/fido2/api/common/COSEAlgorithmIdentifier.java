package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.a;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new zzp();
    private final Algorithm zza;

    public static class UnsupportedAlgorithmIdentifierException extends Exception {
        public UnsupportedAlgorithmIdentifierException(int i2) {
            super(a.k("Algorithm with COSE value ", i2, " not supported"));
        }
    }

    public COSEAlgorithmIdentifier(Algorithm algorithm) {
        this.zza = (Algorithm) Preconditions.checkNotNull(algorithm);
    }

    public static COSEAlgorithmIdentifier fromCoseValue(int i2) throws UnsupportedAlgorithmIdentifierException {
        Algorithm algorithm;
        if (i2 != RSAAlgorithm.LEGACY_RS1.getAlgoValue()) {
            for (RSAAlgorithm rSAAlgorithm : RSAAlgorithm.values()) {
                if (rSAAlgorithm.getAlgoValue() == i2) {
                    algorithm = rSAAlgorithm;
                }
            }
            for (EC2Algorithm eC2Algorithm : EC2Algorithm.values()) {
                if (eC2Algorithm.getAlgoValue() == i2) {
                    algorithm = eC2Algorithm;
                }
            }
            throw new UnsupportedAlgorithmIdentifierException(i2);
        }
        algorithm = RSAAlgorithm.RS1;
        return new COSEAlgorithmIdentifier(algorithm);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.zza.getAlgoValue() == ((COSEAlgorithmIdentifier) obj).zza.getAlgoValue();
    }

    public int hashCode() {
        return Objects.hashCode(this.zza);
    }

    public int toCoseValue() {
        return this.zza.getAlgoValue();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.zza.getAlgoValue());
    }
}
