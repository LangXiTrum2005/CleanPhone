package com.efs.sdk.base.core.d;

import com.efs.sdk.base.core.config.GlobalInfo;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.protocol.record.AbsRecordLog;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends AbsRecordLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f410a;
    private String b;
    private String c;
    private String d;
    private long e;
    private long f;

    public b(String str, String str2, String str3) {
        super("wa");
        this.e = 0L;
        this.f = 0L;
        this.f410a = str;
        this.b = str2;
        this.d = str3;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS", Locale.CHINA);
        com.efs.sdk.base.core.a.a.a();
        this.c = simpleDateFormat.format(new Date(com.efs.sdk.base.core.a.a.b()));
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final byte[] generate() {
        String strGenerateString = generateString();
        if (ControllerCenter.getGlobalEnvStruct().isPrintLogDetail()) {
            Log.i("efs.base", strGenerateString);
        }
        return strGenerateString.getBytes();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String generateString() {
        StringBuilder sbO = DM.o("lt=event`ev_ct=");
        sbO.append(this.f410a);
        sbO.append("`ev_ac=");
        sbO.append(this.b);
        sbO.append("`tm=");
        sbO.append(this.c);
        sbO.append("`dn=");
        sbO.append(this.d);
        sbO.append("`");
        for (Map.Entry<String, Object> entry : this.dataMap.entrySet()) {
            sbO.append(entry.getKey());
            sbO.append("=");
            sbO.append(entry.getValue());
            sbO.append("`");
        }
        return sbO.subSequence(0, sbO.length() - 1).toString();
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkId() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final String getLinkKey() {
        return "";
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final long getLogBeginTime() {
        return this.e;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final long getLogEndTime() {
        return this.f;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void insertGlobal(GlobalInfo globalInfo) {
        this.dataMap.putAll(globalInfo.getGlobalInfoMap());
        this.dataMap.putAll(ControllerCenter.getGlobalEnvStruct().getPublicParamMap());
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void setLogBeginTime(long j) {
        this.e = j;
    }

    @Override // com.efs.sdk.base.protocol.ILogProtocol
    public final void setLogEndTime(long j) {
        this.f = j;
    }
}
