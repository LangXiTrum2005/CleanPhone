package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new zbb();
    final int zba;
    private final boolean zbb;
    private final boolean zbc;
    private final int zbd;

    public static class Builder {
        private boolean zba = false;
        private boolean zbb = true;
        private int zbc = 1;

        public CredentialPickerConfig build() {
            return new CredentialPickerConfig(2, this.zba, this.zbb, false, this.zbc);
        }

        @Deprecated
        public Builder setForNewAccount(boolean z2) {
            this.zbc = true == z2 ? 3 : 1;
            return this;
        }

        public Builder setPrompt(int i2) {
            this.zbc = i2;
            return this;
        }

        public Builder setShowAddAccountButton(boolean z2) {
            this.zba = z2;
            return this;
        }

        public Builder setShowCancelButton(boolean z2) {
            this.zbb = z2;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Prompt {
        public static final int CONTINUE = 1;
        public static final int SIGN_IN = 2;
        public static final int SIGN_UP = 3;
    }

    public CredentialPickerConfig(int i2, boolean z2, boolean z3, boolean z4, int i3) {
        this.zba = i2;
        this.zbb = z2;
        this.zbc = z3;
        if (i2 < 2) {
            this.zbd = true == z4 ? 3 : 1;
        } else {
            this.zbd = i3;
        }
    }

    @Deprecated
    public boolean isForNewAccount() {
        return this.zbd == 3;
    }

    public boolean shouldShowAddAccountButton() {
        return this.zbb;
    }

    public boolean shouldShowCancelButton() {
        return this.zbc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, shouldShowAddAccountButton());
        SafeParcelWriter.writeBoolean(parcel, 2, shouldShowCancelButton());
        SafeParcelWriter.writeBoolean(parcel, 3, isForNewAccount());
        SafeParcelWriter.writeInt(parcel, 4, this.zbd);
        SafeParcelWriter.writeInt(parcel, 1000, this.zba);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
