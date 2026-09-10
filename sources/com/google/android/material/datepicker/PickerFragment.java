package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
abstract class PickerFragment<S> extends Fragment {
    public final LinkedHashSet X = new LinkedHashSet();

    public void b(OnSelectionChangedListener onSelectionChangedListener) {
        this.X.add(onSelectionChangedListener);
    }
}
