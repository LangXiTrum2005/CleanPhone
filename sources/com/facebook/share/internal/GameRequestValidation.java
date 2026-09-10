package com.facebook.share.internal;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.internal.Validate;
import com.facebook.share.model.GameRequestContent;

/* JADX INFO: loaded from: classes3.dex */
public class GameRequestValidation {
    public static void a(GameRequestContent gameRequestContent) {
        Validate.f(gameRequestContent.X, PglCryptUtils.KEY_MESSAGE);
        boolean z2 = gameRequestContent.h0 != null;
        GameRequestContent.ActionType actionType = GameRequestContent.ActionType.f16611Y;
        GameRequestContent.ActionType actionType2 = gameRequestContent.g0;
        if (z2 ^ (actionType2 == actionType || actionType2 == GameRequestContent.ActionType.X)) {
            throw new IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
        }
        int i2 = gameRequestContent.Z != null ? 1 : 0;
        if (gameRequestContent.j0 != null) {
            i2++;
        }
        if (gameRequestContent.i0 != null) {
            i2++;
        }
        if (i2 > 1) {
            throw new IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
        }
    }
}
