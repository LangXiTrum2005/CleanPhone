package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.p004ironsource.mediationsdk.metadata.a;

/* JADX INFO: loaded from: classes4.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] k0 = {R.attr.state_checked};
    public boolean h0;
    public boolean i0;
    public boolean j0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public boolean Z;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.Z ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.charging.screenshow.battery.animations.themes.R.attr.imageButtonStyle);
        this.i0 = true;
        this.j0 = true;
        ViewCompat.z(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.CheckableImageButton.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void c(View view, AccessibilityEvent accessibilityEvent) {
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(CheckableImageButton.this.h0);
            }

            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                View.AccessibilityDelegate accessibilityDelegate = this.f4417a;
                AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f4534a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = CheckableImageButton.this;
                accessibilityNodeInfo.setCheckable(checkableImageButton.i0);
                accessibilityNodeInfo.setChecked(checkableImageButton.h0);
            }
        });
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.h0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        return this.h0 ? View.mergeDrawableStates(super.onCreateDrawableState(i2 + 1), k0) : super.onCreateDrawableState(i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.X);
        setChecked(savedState.Z);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Z = this.h0;
        return savedState;
    }

    public void setCheckable(boolean z2) {
        if (this.i0 != z2) {
            this.i0 = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.i0 || this.h0 == z2) {
            return;
        }
        this.h0 = z2;
        refreshDrawableState();
        sendAccessibilityEvent(a.f25965n);
    }

    public void setPressable(boolean z2) {
        this.j0 = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.j0) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.h0);
    }
}
