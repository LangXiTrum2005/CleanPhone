package com.google.android.exoplayer2.text;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface TextOutput {
    void onCues(CueGroup cueGroup);

    default void onCues(List list) {
    }
}
