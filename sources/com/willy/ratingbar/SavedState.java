package com.willy.ratingbar;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
class SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
    public float X;

    /* JADX INFO: renamed from: com.willy.ratingbar.SavedState$1, reason: invalid class name */
    public static class AnonymousClass1 implements Parcelable.Creator<SavedState> {
        @Override // android.os.Parcelable.Creator
        public final SavedState createFromParcel(Parcel parcel) {
            SavedState savedState = new SavedState(parcel);
            savedState.X = parcel.readFloat();
            return savedState;
        }

        @Override // android.os.Parcelable.Creator
        public final SavedState[] newArray(int i2) {
            return new SavedState[i2];
        }
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeFloat(this.X);
    }
}
