package com.startapp.sdk.internal;

import android.content.Context;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: classes6.dex */
public final class ha extends k6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(Context context) {
        super(context);
        Intrinsics.f(context, "context");
    }

    public static final String b(InputMethodSubtype inputMethodSubtype) {
        Intrinsics.c(inputMethodSubtype);
        return ga.a(inputMethodSubtype);
    }

    @Override // com.startapp.sdk.internal.k6
    public final /* bridge */ /* synthetic */ Object c() {
        return fa.f40961b;
    }

    @Override // com.startapp.sdk.internal.k6
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final fa a() {
        Set setH;
        Object systemService = this.f41177a.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            InputMethodSubtype currentInputMethodSubtype = inputMethodManager.getCurrentInputMethodSubtype();
            Sequence sequenceF = ArraysKt.f(new String[]{currentInputMethodSubtype != null ? ga.a(currentInputMethodSubtype) : null});
            List<InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
            Intrinsics.e(inputMethodList, "getInputMethodList(...)");
            Iterator it = SequencesKt.u(SequencesKt.g(SequencesKt.h(SequencesKt.r(sequenceF, SequencesKt.o(SequencesKt.g(SequencesKt.j(SequencesKt.o(CollectionsKt.k(inputMethodList), new androidx.room.b(inputMethodManager, 11))), new androidx.room.d(8)), new androidx.room.d(9))), new androidx.room.d(16)), new androidx.room.d(10)), 10).iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(next);
                    while (it.hasNext()) {
                        linkedHashSet.add(it.next());
                    }
                    setH = linkedHashSet;
                } else {
                    setH = SetsKt.h(next);
                }
            } else {
                setH = EmptySet.X;
            }
            if (!setH.isEmpty()) {
                return new fa(setH);
            }
        }
        return null;
    }

    public static final List a(InputMethodManager systemService, InputMethodInfo inputMethodInfo) {
        Intrinsics.f(systemService, "$systemService");
        return systemService.getEnabledInputMethodSubtypeList(inputMethodInfo, true);
    }

    public static final boolean a(InputMethodSubtype inputMethodSubtype) {
        return "keyboard".equals(inputMethodSubtype.getMode());
    }

    public static final boolean a(String it) {
        Intrinsics.f(it, "it");
        return it.length() > 0;
    }
}
