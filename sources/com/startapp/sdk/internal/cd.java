package com.startapp.sdk.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.applovin.impl.H0;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MraidMetadata;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class cd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb f40874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f40875b;

    public cd(lb lbVar, File file, s5 s5Var) {
        this.f40874a = lbVar;
        this.f40875b = file;
    }

    public final int a(String str, String str2) throws Throwable {
        InputStream inputStream;
        File file = new File(this.f40875b, "24e22423049bbf51");
        long jLastModified = file.lastModified();
        if (jLastModified > 0) {
            if (Math.max(0L, str2 != null ? vi.e(str2) : 86400000L) + jLastModified > System.currentTimeMillis()) {
                return 2;
            }
            if (!file.delete()) {
                return 4;
            }
        }
        this.f40875b.mkdirs();
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        File file2 = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream = null;
        if (uRLConnectionOpenConnection != null) {
            try {
                uRLConnectionOpenConnection.setConnectTimeout(5000);
                uRLConnectionOpenConnection.setReadTimeout(5000);
                inputStream = uRLConnectionOpenConnection.getInputStream();
                try {
                    File fileCreateTempFile = File.createTempFile("tmp", "tmp", this.f40875b);
                    FileOutputStream fileOutputStream2 = new FileOutputStream(fileCreateTempFile);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i2 = inputStream.read(bArr);
                            if (i2 <= 0) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, i2);
                        }
                        vi.a(inputStream);
                        vi.a(fileOutputStream2);
                        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                            try {
                                ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                            } catch (Exception unused) {
                            }
                        }
                        file2 = fileCreateTempFile;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        vi.a(inputStream);
                        vi.a(fileOutputStream);
                        if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                            try {
                                ((HttpURLConnection) uRLConnectionOpenConnection).disconnect();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        }
        return (file2 == null || !file2.renameTo(file)) ? 5 : 3;
    }

    public final WebResourceResponse b() {
        try {
            return new WebResourceResponse("text/javascript", "UTF-8", new FileInputStream(new File(this.f40875b, "24e22423049bbf51")));
        } catch (FileNotFoundException e2) {
            MraidMetadata mraidMetadataK = MetaData.E().K();
            ComponentInfoEventConfig componentInfoEventConfigB = mraidMetadataK != null ? mraidMetadataK.b() : null;
            if (componentInfoEventConfigB != null && componentInfoEventConfigB.a(2)) {
                g9.a(e2);
            }
            return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream("!function(){console.log(\"MRAID object loading...\");var e=window.top.mraid&&\"object\"==typeof window.top.mraid?window.top.mraid:null;if(e){window.mraid=e,console.log(\"MRAID object already exists\");return}var t={DEBUG:0,INFO:1,WARNING:2,ERROR:3,NONE:4},i=t.WARNING,r={};r.d=function(e){i<=t.DEBUG&&console.log(\"(D-mraid.js) \"+e)},r.i=function(e){i<=t.INFO&&console.log(\"(I-mraid.js) \"+e)},r.w=function(e){i<=t.WARNING&&console.log(\"(W-mraid.js) \"+e)},r.e=function(e){i<=t.ERROR&&console.log(\"(E-mraid.js) \"+e)};var n={};window.mraid=n,window.top.mraid=n,n._sioVersion=\"0.1\";var o=n.STATES={LOADING:\"loading\",DEFAULT:\"default\",EXPANDED:\"expanded\",RESIZED:\"resized\",HIDDEN:\"hidden\"},s=n.PLACEMENT_TYPES={INLINE:\"inline\",INTERSTITIAL:\"interstitial\"},a=n.RESIZE_PROPERTIES_CUSTOM_CLOSE_POSITION={TOP_LEFT:\"top-left\",TOP_CENTER:\"top-center\",TOP_RIGHT:\"top-right\",CENTER:\"center\",BOTTOM_LEFT:\"bottom-left\",BOTTOM_CENTER:\"bottom-center\",BOTTOM_RIGHT:\"bottom-right\"},f=n.ORIENTATION_PROPERTIES_FORCE_ORIENTATION={PORTRAIT:\"portrait\",LANDSCAPE:\"landscape\",NONE:\"none\"},d=n.EVENTS={ERROR:\"error\",READY:\"ready\",SIZECHANGE:\"sizeChange\",STATECHANGE:\"stateChange\",VIEWABLECHANGE:\"viewableChange\"};n.SUPPORTED_FEATURES={SMS:\"sms\",TEL:\"tel\",CALENDAR:\"calendar\",STOREPICTURE:\"storePicture\",INLINEVIDEO:\"inlineVideo\"};var h=o.LOADING,u=s.INLINE,l={},E=!1,c=!1,g=!1,m={width:0,height:0,useCustomClose:!1,isModal:!0},p={allowOrientationChange:!0,forceOrientation:f.NONE},O={width:0,height:0,customClosePosition:a.TOP_RIGHT,offsetX:0,offsetY:0,allowOffscreen:!0},v={x:0,y:0,width:0,height:0},C={x:0,y:0,width:0,height:0},P={width:0,height:0},w={width:0,height:0},R={};function y(e){var t=document.createElement(\"IFRAME\");t.setAttribute(\"src\",\"mraid://\"+e),document.documentElement.appendChild(t),t.parentNode.removeChild(t),t=null}function T(e){var t=Array.prototype.slice.call(arguments);t.shift(),r.i(\"fireEvent \"+e+\" [\"+t.toString()+\"]\");var i=R[e];if(i){var n=(i=i.slice()).length;r.i(n+\" listener(s) found\");for(var o=0;o<n;o++)i[o].apply(null,t)}else r.i(\"no listeners found\")}function x(e,t){for(var i in t)if(t[i]===e)return!0;return!1}function N(e,t){var i=!0,r=S[t];for(var o in e){var s=r[o],a=e[o];s&&!s(a)&&(n.fireErrorEvent(\"Value of property \"+o+\" (\"+a+\") is invalid\",\"mraid.\"+t),i=!1)}return i}n.addEventListener=function(e,t){if(r.i(\"mraid.addEventListener \"+e+\": \"+String(t)),!e||!t){n.fireErrorEvent(\"Both event and listener are required.\",\"addEventListener\");return}if(!x(e,d)){n.fireErrorEvent(\"Unknown MRAID event: \"+e,\"addEventListener\");return}for(var i=R[e]=R[e]||[],o=0;o<i.length;o++){var s=String(t),a=String(i[o]);if(t===i[o]||s===a){r.i(\"listener \"+s+\" is already registered for event \"+e);return}}i.push(t)},n.createCalendarEvent=function(e){r.i(\"mraid.createCalendarEvent with \"+e),l[n.SUPPORTED_FEATURES.CALENDAR]?y(\"createCalendarEvent?eventJSON=\"+JSON.stringify(e)):r.e(\"createCalendarEvent is not supported\")},n.close=function(){r.i(\"mraid.close\"),h!==o.LOADING&&(h!==o.DEFAULT||u!==s.INLINE)&&h!==o.HIDDEN&&y(\"close\")},n.expand=function(e){void 0===e?r.i(\"mraid.expand (1-part)\"):r.i(\"mraid.expand \"+e),u===s.INLINE&&(h===o.DEFAULT||h===o.RESIZED)&&(void 0===e?y(\"expand\"):y(\"expand?url=\"+encodeURIComponent(e)))},n.getCurrentPosition=function(){return r.i(\"mraid.getCurrentPosition\"),v},n.getDefaultPosition=function(){return r.i(\"mraid.getDefaultPosition\"),C},n.getExpandProperties=function(){return r.i(\"mraid.getExpandProperties\"),m},n.getMaxSize=function(){return r.i(\"mraid.getMaxSize\"),P},n.getOrientationProperties=function(){return r.i(\"mraid.getOrientationProperties\"),p},n.getPlacementType=function(){return r.i(\"mraid.getPlacementType\"),u},n.getResizeProperties=function(){return r.i(\"mraid.getResizeProperties\"),O},n.getScreenSize=function(){return r.i(\"mraid.getScreenSize\"),w},n.getState=function(){return r.i(\"mraid.getState\"),h},n.getVersion=function(){return r.i(\"mraid.getVersion\"),\"2.0\"},n.isViewable=function(){return r.i(\"mraid.isViewable\"),E},n.open=function(e){r.i(\"mraid.open \"+e),y(\"open?url=\"+encodeURIComponent(e))},n.playVideo=function(e){r.i(\"mraid.playVideo \"+e),y(\"playVideo?url=\"+encodeURIComponent(e))},n.removeEventListener=function(e,t){if(r.i(\"mraid.removeEventListener \"+e+\" : \"+String(t)),!e){n.fireErrorEvent(\"Event is required.\",\"removeEventListener\");return}if(!x(e,d)){n.fireErrorEvent(\"Unknown MRAID event: \"+e,\"removeEventListener\");return}if(R.hasOwnProperty(e)){if(t){for(var i=R[e],o=i.length,s=0;s<o;s++){var a=i[s],f=String(t),h=String(a);if(t===a||f===h){i.splice(s,1);break}}s===o&&r.i(\"listener \"+f+\" not found for event \"+e),0===i.length&&delete R[e]}else delete R[e]}else r.i(\"no listeners registered for event \"+e)},n.resize=function(){if(r.i(\"mraid.resize\"),u!==s.INTERSTITIAL&&h!==o.LOADING&&h!==o.HIDDEN){if(h===o.EXPANDED){n.fireErrorEvent(\"mraid.resize called when ad is in expanded state\",\"mraid.resize\");return}if(!g){n.fireErrorEvent(\"mraid.resize is not ready to be called\",\"mraid.resize\");return}y(\"resize\")}},n.setExpandProperties=function(e){if(r.i(\"mraid.setExpandProperties\"),!N(e,\"setExpandProperties\")){r.e(\"failed validation\");return}for(var t=m.useCustomClose,i=[\"width\",\"height\",\"useCustomClose\"],n=0;n<i.length;n++){var o=i[n];e.hasOwnProperty(o)&&(m[o]=e[o])}m.useCustomClose!==t&&y(\"useCustomClose?useCustomClose=\"+m.useCustomClose),c=!0},n.setOrientationProperties=function(e){if(r.i(\"mraid.setOrientationProperties\"),!N(e,\"setOrientationProperties\")){r.e(\"failed validation\");return}var t={};t.allowOrientationChange=p.allowOrientationChange,t.forceOrientation=p.forceOrientation;for(var i=[\"allowOrientationChange\",\"forceOrientation\"],o=0;o<i.length;o++){var s=i[o];e.hasOwnProperty(s)&&(t[s]=e[s])}if(t.allowOrientationChange&&t.forceOrientation!==n.ORIENTATION_PROPERTIES_FORCE_ORIENTATION.NONE){n.fireErrorEvent(\"allowOrientationChange is true but forceOrientation is \"+t.forceOrientation,\"setOrientationProperties\");return}p.allowOrientationChange=t.allowOrientationChange,p.forceOrientation=t.forceOrientation,y(\"setOrientationProperties?\"+(\"allowOrientationChange=\"+p.allowOrientationChange+\"&forceOrientation=\")+p.forceOrientation)},n.setResizeProperties=function(e){r.i(\"mraid.setResizeProperties\"),g=!1;for(var t,i,o,s,a,f,d,h,u,l=[\"width\",\"height\",\"offsetX\",\"offsetY\"],E=0;E<l.length;E++){var c=l[E];if(!e.hasOwnProperty(c)){n.fireErrorEvent(\"required property \"+c+\" is missing\",\"mraid.setResizeProperties\");return}}if(!N(e,\"setResizeProperties\")){n.fireErrorEvent(\"failed validation\",\"mraid.setResizeProperties\");return}var m={x:0,y:0};if(e.hasOwnProperty(\"allowOffscreen\")?e.allowOffscreen:O.allowOffscreen){if(t=e,r.d(\"isCloseRegionOnScreen\"),r.d(\"defaultPosition \"+C.x+\" \"+C.y),r.d(\"offset \"+t.offsetX+\" \"+t.offsetY),i={},i.x=C.x+t.offsetX,i.y=C.y+t.offsetY,i.width=t.width,i.height=t.height,$(\"resizeRect\",i),o=t.hasOwnProperty(\"customClosePosition\")?t.customClosePosition:O.customClosePosition,r.d(\"customClosePosition \"+o),s={width:50,height:50},-1!==o.search(\"left\")?s.x=i.x:-1!==o.search(\"center\")?s.x=i.x+i.width/2-25:-1!==o.search(\"right\")&&(s.x=i.x+i.width-50),-1!==o.search(\"top\")?s.y=i.y:\"center\"===o?s.y=i.y+i.height/2-25:-1!==o.search(\"bottom\")&&(s.y=i.y+i.height-50),a={x:0,y:0},a.width=P.width,a.height=P.height,!I(a,s)){n.fireErrorEvent(\"close event region will not appear entirely onscreen\",\"mraid.setResizeProperties\");return}}else{if(e.width>P.width||e.height>P.height){n.fireErrorEvent(\"resize width or height is greater than the maxSize width or height\",\"mraid.setResizeProperties\");return}m=(f=e,r.d(\"fitResizeViewOnScreen\"),r.d(\"defaultPosition \"+C.x+\" \"+C.y),r.d(\"offset \"+f.offsetX+\" \"+f.offsetY),d={},d.x=C.x+f.offsetX,d.y=C.y+f.offsetY,d.width=f.width,d.height=f.height,$(\"resizeRect\",d),h={x:0,y:0},h.width=P.width,h.height=P.height,u={x:0,y:0},I(h,d)?(r.d(\"no adjustment necessary\"),u):(d.x<h.x?u.x=h.x-d.x:d.x+d.width>h.x+h.width&&(u.x=h.x+h.width-(d.x+d.width)),r.d(\"adjustments.x \"+u.x),d.y<h.y?u.y=h.y-d.y:d.y+d.height>h.y+h.height&&(u.y=h.y+h.height-(d.y+d.height)),r.d(\"adjustments.y \"+u.y),d.x=C.x+f.offsetX+u.x,d.y=C.y+f.offsetY+u.y,$(\"adjusted resizeRect\",d),u))}for(var p=[\"width\",\"height\",\"offsetX\",\"offsetY\",\"customClosePosition\",\"allowOffscreen\"],E=0;E<p.length;E++){var c=p[E];e.hasOwnProperty(c)&&(O[c]=e[c])}y(\"setResizeProperties?\"+(\"width=\"+O.width+\"&height=\"+O.height+\"&offsetX=\"+(O.offsetX+m.x)+\"&offsetY=\"+(O.offsetY+m.y)+\"&customClosePosition=\"+O.customClosePosition+\"&allowOffscreen=\")+O.allowOffscreen),g=!0},n.storePicture=function(e){r.i(\"mraid.storePicture \"+e),l[n.SUPPORTED_FEATURES.STOREPICTURE]?y(\"storePicture?url=\"+encodeURIComponent(e)):r.e(\"storePicture is not supported\")},n.supports=function(e){r.i(\"mraid.supports \"+e+\" \"+l[e]);var t=l[e];return void 0===t&&(t=!1),t},n.useCustomClose=function(e){r.i(\"mraid.useCustomClose \"+e),m.useCustomClose!==e&&(m.useCustomClose=e,y(\"useCustomClose?useCustomClose=\"+m.useCustomClose))},n.setCurrentPosition=function(e,t,i,o){r.i(\"mraid.setCurrentPosition \"+e+\",\"+t+\",\"+i+\",\"+o);var s={};s.width=v.width,s.height=v.height,r.i(\"previousSize \"+s.width+\",\"+s.height),v.x=e,v.y=t,v.width=i,v.height=o,(i!==s.width||o!==s.height)&&n.fireSizeChangeEvent(i,o)},n.setDefaultPosition=function(e,t,i,n){r.i(\"mraid.setDefaultPosition \"+e+\",\"+t+\",\"+i+\",\"+n),C.x=e,C.y=t,C.width=i,C.height=n},n.setExpandSize=function(e,t){r.i(\"mraid.setExpandSize \"+e+\"x\"+t),m.width=e,m.height=t},n.setMaxSize=function(e,t){r.i(\"mraid.setMaxSize \"+e+\"x\"+t),P.width=e,P.height=t},n.setPlacementType=function(e){r.i(\"mraid.setPlacementType \"+e),u=e},n.setScreenSize=function(e,t){r.i(\"mraid.setScreenSize \"+e+\"x\"+t),w.width=e,w.height=t,c||(m.width=e,m.height=t)},n.setSupports=function(e,t){r.i(\"mraid.setSupports \"+e+\" \"+t),l[e]=t},n.fireErrorEvent=function(e,t){r.i(\"mraid.fireErrorEvent \"+e+\" \"+t),T(n.EVENTS.ERROR,e,t)},n.fireReadyEvent=function(){r.i(\"mraid.fireReadyEvent\"),T(n.EVENTS.READY)},n.fireSizeChangeEvent=function(e,t){r.i(\"mraid.fireSizeChangeEvent \"+e+\"x\"+t),h!==n.STATES.LOADING&&T(n.EVENTS.SIZECHANGE,e,t)},n.fireStateChangeEvent=function(e){r.i(\"mraid.fireStateChangeEvent \"+e),h!==e&&(h=e,T(n.EVENTS.STATECHANGE,h))},n.fireViewableChangeEvent=function(e){r.i(\"mraid.fireViewableChangeEvent \"+e),E!==e&&(E=e,T(n.EVENTS.VIEWABLECHANGE,E))};var S={setExpandProperties:{width:function(e){return!isNaN(e)},height:function(e){return!isNaN(e)},useCustomClose:function(e){return\"boolean\"==typeof e}},setOrientationProperties:{allowOrientationChange:function(e){return\"boolean\"==typeof e},forceOrientation:function(e){return\"string\"==typeof e&&-1!==[\"portrait\",\"landscape\",\"none\"].indexOf(e)}},setResizeProperties:{width:function(e){return!isNaN(e)&&50<=e},height:function(e){return!isNaN(e)&&50<=e},offsetX:function(e){return!isNaN(e)},offsetY:function(e){return!isNaN(e)},customClosePosition:function(e){return\"string\"==typeof e&&-1!==[\"top-left\",\"top-center\",\"top-right\",\"center\",\"bottom-left\",\"bottom-center\",\"bottom-right\"].indexOf(e)},allowOffscreen:function(e){return\"boolean\"==typeof e}}};function I(e,t){return r.d(\"isRectContained\"),$(\"containingRect\",e),$(\"containedRect\",t),t.x>=e.x&&t.x+t.width<=e.x+e.width&&t.y>=e.y&&t.y+t.height<=e.y+e.height}function $(e,t){r.d(e+\" [\"+t.x+\",\"+t.y+\"],[\"+(t.x+t.width)+\",\"+(t.y+t.height)+\"] (\"+t.width+\"x\"+t.height+\")\")}n.dumpListeners=function(){var e=Object.keys(R).length;for(var t in r.i(\"dumping listeners (\"+e+\" events)\"),R){var i=R[t];r.i(\"  \"+t+\" contains \"+i.length+\" listeners\");for(var n=0;n<i.length;n++)r.i(\"    \"+i[n])}},console.log(\"MRAID object loaded\")}();".getBytes()));
        }
    }

    public final void a(String str, String str2, i7 i7Var) {
        try {
            int iA = a(str, str2);
            if (i7Var != null) {
                i7Var.a(Integer.valueOf(iA));
            }
        } catch (Throwable th) {
            try {
                MraidMetadata mraidMetadataK = MetaData.E().K();
                ComponentInfoEventConfig componentInfoEventConfigB = mraidMetadataK != null ? mraidMetadataK.b() : null;
                if (componentInfoEventConfigB != null && componentInfoEventConfigB.a(1)) {
                    g9.a(th);
                }
            } finally {
                if (i7Var != null) {
                    i7Var.a(5);
                }
            }
        }
    }

    public static boolean a(String str) {
        try {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            if (lastPathSegment != null) {
                return "mraid.js".equals(lastPathSegment.toLowerCase(Locale.ENGLISH));
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void a() {
        String strC;
        MraidMetadata mraidMetadataK = MetaData.E().K();
        if (mraidMetadataK == null || (strC = mraidMetadataK.c()) == null) {
            return;
        }
        ((Executor) this.f40874a.a()).execute(new H0(this, strC, mraidMetadataK.d(), 27));
    }
}
