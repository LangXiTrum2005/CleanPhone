package com.afollestad.materialdialogs.prefs;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.Preference;

/* JADX INFO: loaded from: classes.dex */
class MaterialMultiSelectListPreference$SavedState extends Preference.BaseSavedState {
    public static final Parcelable.Creator<MaterialMultiSelectListPreference$SavedState> CREATOR = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50a;
    public final Bundle b;

    public MaterialMultiSelectListPreference$SavedState(Parcel parcel) {
        super(parcel);
        this.f50a = parcel.readInt() == 1;
        this.b = parcel.readBundle();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f50a ? 1 : 0);
        parcel.writeBundle(this.b);
    }

    public MaterialMultiSelectListPreference$SavedState(Parcelable parcelable) {
        super(parcelable);
    }
}
