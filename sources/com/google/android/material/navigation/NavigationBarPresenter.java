package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.SubMenuBuilder;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationBarPresenter implements MenuPresenter {

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public ParcelableSparseArray f19374Y;

        /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.X = parcel.readInt();
                savedState.f19374Y = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.X);
            parcel.writeParcelable(this.f19374Y, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void b(MenuBuilder menuBuilder, boolean z2) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean d(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean e(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean f(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void g(boolean z2) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean h() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void i(Context context, MenuBuilder menuBuilder) {
        throw null;
    }
}
