package com.mbridge.msdk.newreward.function.command.receiver;

import com.mbridge.msdk.newreward.function.command.receiver.concretereceiver.ReportReceiver;
import com.mbridge.msdk.newreward.function.command.receiver.showreceiver.MoreOfferPreSendTrackingReceiver;
import com.mbridge.msdk.newreward.function.command.receiver.tagreceiver.DoReceiver;
import com.mbridge.msdk.newreward.function.command.receiver.tagreceiver.NewShowReceiver;
import com.mbridge.msdk.newreward.function.command.receiver.tagreceiver.OMSDKReceiver;
import com.mbridge.msdk.newreward.function.command.receiver.tagreceiver.PlayFrequenceReceiver;
import com.mbridge.msdk.newreward.function.command.receiver.tagreceiver.SharePreReceiver;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    public b a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("id is null!");
        }
        if ("SharePreReceiver".equals(str)) {
            return new SharePreReceiver();
        }
        if ("NewShowReceiver".equals(str)) {
            return new NewShowReceiver();
        }
        if ("PlayFrequenceReceiver".equals(str)) {
            return new PlayFrequenceReceiver();
        }
        if ("DoReceiver".equals(str)) {
            return new DoReceiver();
        }
        if ("OMSDKReceiver".equals(str)) {
            return new OMSDKReceiver();
        }
        if ("MoreOfferPreSendTrackingReceiver".equals(str)) {
            return new MoreOfferPreSendTrackingReceiver();
        }
        if ("ReportReceiver".equals(str)) {
            return new ReportReceiver();
        }
        throw new IllegalArgumentException("Unknown id = ".concat(str));
    }
}
