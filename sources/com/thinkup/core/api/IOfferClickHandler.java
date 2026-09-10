package com.thinkup.core.api;

import android.content.Context;
import com.thinkup.core.common.on.oom;
import com.thinkup.core.common.on.ooo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class IOfferClickHandler implements Serializable {
    public abstract boolean startDataFetchApp(Context context, ooo oooVar, oom oomVar, String str);
}
