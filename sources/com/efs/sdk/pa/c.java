package com.efs.sdk.pa;

import android.content.Context;
import android.text.TextUtils;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.core.util.secure.EncodeUtil;
import com.efs.sdk.base.custommapping.InnerCustomMappingManager;
import com.efs.sdk.base.protocol.file.EfsTextFile;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.efs.sdk.base.protocol.file.section.TextSection;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.umcrash.UMCrash;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static synchronized void a(PAFactory pAFactory, String str, String str2) {
        try {
            EfsTextFile efsTextFile = new EfsTextFile(str);
            KVSection kVSectionCreateAndAddKVSection = efsTextFile.createAndAddKVSection("custom_info");
            kVSectionCreateAndAddKVSection.put("bserial", pAFactory.getSerial());
            kVSectionCreateAndAddKVSection.put("bsver", pAFactory.getSver());
            HashMap<String, String> extend = pAFactory.getExtend();
            if (extend != null && !extend.isEmpty()) {
                for (Map.Entry<String, String> entry : extend.entrySet()) {
                    kVSectionCreateAndAddKVSection.put(entry.getKey(), entry.getValue());
                }
            }
            kVSectionCreateAndAddKVSection.put("crver", "2.1.160.umeng");
            String strA = a(pAFactory.getContext());
            if (!TextUtils.isEmpty(strA)) {
                kVSectionCreateAndAddKVSection.put(UMCrash.KEY_CALLBACK_SESSION_ID, strA);
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    String strOnGetCallbackInfo = pAFactory.getPaClient().onGetCallbackInfo(UMCrash.KEY_CALLBACK_USER_STRING);
                    if (pAFactory.getPaClient() != null && !TextUtils.isEmpty(strOnGetCallbackInfo)) {
                        kVSectionCreateAndAddKVSection.put(UMCrash.KEY_CALLBACK_USER_STRING, EncodeUtil.base64EncodeToStr(strOnGetCallbackInfo.getBytes()));
                    }
                    String strOnGetCallbackInfo2 = pAFactory.getPaClient().onGetCallbackInfo(UMCrash.KEY_CALLBACK_PAGE_ACTION);
                    if (pAFactory.getPaClient() != null && !TextUtils.isEmpty(strOnGetCallbackInfo2)) {
                        kVSectionCreateAndAddKVSection.put(UMCrash.KEY_CALLBACK_PAGE_ACTION, EncodeUtil.base64EncodeToStr(strOnGetCallbackInfo2.getBytes()));
                    }
                    String customMappingJsonStr = InnerCustomMappingManager.getCustomMappingJsonStr();
                    if (pAFactory.getPaClient() != null && !TextUtils.isEmpty(customMappingJsonStr)) {
                        kVSectionCreateAndAddKVSection.put(UMCrash.KEY_CALLBACK_CUSTOM_MAPPING, EncodeUtil.base64EncodeToStr(customMappingJsonStr.getBytes()));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                TextSection textSectionCreateAndAddTextSection = efsTextFile.createAndAddTextSection("stack");
                textSectionCreateAndAddTextSection.setBody(str2);
                textSectionCreateAndAddTextSection.setSep(AbsSection.SEP_LINE_BREAK);
            }
            EfsReporter reporter = pAFactory.getReporter();
            if (reporter != null) {
                reporter.send(efsTextFile);
            }
            pAFactory.getConfigManager().increaseUploadSmoothLogCnt();
            "reportPaWpkStats: stack: ".concat(String.valueOf(str2));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static String a(Context context) {
        Class<DeviceConfig> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = DeviceConfig.class;
            String str = DeviceConfig.UNKNOW;
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getSid", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, context);
            if (objInvoke != null) {
                return objInvoke.toString();
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }
}
