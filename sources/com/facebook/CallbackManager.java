package com.facebook;

import android.content.Intent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/CallbackManager;", "", "Factory", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public interface CallbackManager {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/CallbackManager$Factory;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Factory {
    }

    boolean onActivityResult(int i2, int i3, Intent intent);
}
