package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f19262Y;
    public DateSelector Z;
    public CalendarConstraints e0;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f19262Y = bundle.getInt("THEME_RES_ID_KEY");
        this.Z = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.e0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.Z.N0(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f19262Y)), viewGroup, this.e0, new OnSelectionChangedListener<Object>() { // from class: com.google.android.material.datepicker.MaterialTextInputPicker.1
            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public final void a() {
                Iterator it = MaterialTextInputPicker.this.X.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).a();
                }
            }

            @Override // com.google.android.material.datepicker.OnSelectionChangedListener
            public final void b(Object obj) {
                Iterator it = MaterialTextInputPicker.this.X.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).b(obj);
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f19262Y);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.Z);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.e0);
    }
}
