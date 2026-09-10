package com.badlogic.gdx.maps.tiled;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.Key;
import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.TextureLoader;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.ImageResolver;
import com.badlogic.gdx.maps.MapGroupLayer;
import com.badlogic.gdx.maps.MapLayer;
import com.badlogic.gdx.maps.MapLayers;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapObjects;
import com.badlogic.gdx.maps.MapProperties;
import com.badlogic.gdx.maps.objects.EllipseMapObject;
import com.badlogic.gdx.maps.objects.PolygonMapObject;
import com.badlogic.gdx.maps.objects.PolylineMapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.BaseTiledMapLoader.Parameters;
import com.badlogic.gdx.maps.tiled.objects.TiledMapTileMapObject;
import com.badlogic.gdx.maps.tiled.tiles.AnimatedTiledMapTile;
import com.badlogic.gdx.maps.tiled.tiles.StaticTiledMapTile;
import com.badlogic.gdx.math.Polygon;
import com.badlogic.gdx.math.Polyline;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Base64Coder;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.IntArray;
import com.badlogic.gdx.utils.IntMap;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.SerializationException;
import com.badlogic.gdx.utils.StreamUtils;
import com.efs.sdk.base.Constants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTmjMapLoader<P extends BaseTiledMapLoader.Parameters> extends BaseTiledMapLoader<P> {
    protected JsonReader json;
    protected JsonValue root;

    public BaseTmjMapLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.json = new JsonReader();
    }

    private void addTileObjectGroup(TiledMapTile tiledMapTile, JsonValue jsonValue) {
        JsonValue jsonValue2 = jsonValue.get("objectgroup");
        if (jsonValue2 != null) {
            Iterator<JsonValue> itIterator2 = jsonValue2.get("objects").iterator2();
            while (itIterator2.hasNext()) {
                loadObject(this.map, tiledMapTile, itIterator2.next());
            }
        }
    }

    private void addTileProperties(TiledMapTile tiledMapTile, JsonValue jsonValue) {
        String string = jsonValue.getString("terrain", null);
        if (string != null) {
            tiledMapTile.getProperties().put("terrain", string);
        }
        String string2 = jsonValue.getString("probability", null);
        if (string2 != null) {
            tiledMapTile.getProperties().put("probability", string2);
        }
        String string3 = jsonValue.getString("type", null);
        if (string3 != null) {
            tiledMapTile.getProperties().put("type", string3);
        }
        JsonValue jsonValue2 = jsonValue.get("properties");
        if (jsonValue2 != null) {
            loadProperties(tiledMapTile.getProperties(), jsonValue2);
        }
    }

    private AnimatedTiledMapTile createAnimatedTile(TiledMapTileSet tiledMapTileSet, TiledMapTile tiledMapTile, JsonValue jsonValue, int i) {
        JsonValue jsonValue2 = jsonValue.get("animation");
        if (jsonValue2 == null) {
            return null;
        }
        Array array = new Array();
        IntArray intArray = new IntArray();
        Iterator<JsonValue> itIterator2 = jsonValue2.iterator2();
        while (itIterator2.hasNext()) {
            JsonValue next = itIterator2.next();
            array.add((StaticTiledMapTile) tiledMapTileSet.getTile(next.getInt("tileid") + i));
            intArray.add(next.getInt("duration"));
        }
        AnimatedTiledMapTile animatedTiledMapTile = new AnimatedTiledMapTile(intArray, (Array<StaticTiledMapTile>) array);
        animatedTiledMapTile.setId(tiledMapTile.getId());
        return animatedTiledMapTile;
    }

    public static int[] getTileIds(JsonValue jsonValue, int i, int i2) {
        InputStream byteArrayInputStream;
        JsonValue jsonValue2 = jsonValue.get("data");
        String string = jsonValue.getString("encoding", null);
        if (string == null || string.isEmpty() || string.equals("csv")) {
            return jsonValue2.asIntArray();
        }
        try {
            if (!string.equals("base64")) {
                throw new GdxRuntimeException(DM.B("Unrecognised encoding (", string, ") for TMJ Layer Data"));
            }
            try {
                String string2 = jsonValue.getString("compression", null);
                byte[] bArrDecode = Base64Coder.decode(jsonValue2.asString());
                if (string2 == null || string2.isEmpty()) {
                    byteArrayInputStream = new ByteArrayInputStream(bArrDecode);
                } else if (string2.equals(Constants.CP_GZIP)) {
                    byteArrayInputStream = new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(bArrDecode), bArrDecode.length));
                } else {
                    if (!string2.equals("zlib")) {
                        throw new GdxRuntimeException("Unrecognised compression (" + string2 + ") for TMJ Layer Data");
                    }
                    byteArrayInputStream = new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(bArrDecode)));
                }
                InputStream inputStream = byteArrayInputStream;
                byte[] bArr = new byte[4];
                int[] iArr = new int[i * i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    for (int i4 = 0; i4 < i; i4++) {
                        int i5 = inputStream.read(bArr);
                        while (i5 < 4) {
                            int i6 = inputStream.read(bArr, i5, 4 - i5);
                            if (i6 == -1) {
                                break;
                            }
                            i5 += i6;
                        }
                        if (i5 != 4) {
                            throw new GdxRuntimeException("Error Reading TMJ Layer Data: Premature end of tile data");
                        }
                        iArr[(i3 * i) + i4] = BaseTiledMapLoader.unsignedByteToInt(bArr[0]) | (BaseTiledMapLoader.unsignedByteToInt(bArr[1]) << 8) | (BaseTiledMapLoader.unsignedByteToInt(bArr[2]) << 16) | (BaseTiledMapLoader.unsignedByteToInt(bArr[3]) << 24);
                    }
                }
                StreamUtils.closeQuietly(inputStream);
                return iArr;
            } catch (IOException e) {
                throw new GdxRuntimeException("Error Reading TMJ Layer Data - IOException: " + e.getMessage());
            }
        } catch (Throwable th) {
            StreamUtils.closeQuietly(null);
            throw th;
        }
    }

    private void loadProperties(MapProperties mapProperties, JsonValue jsonValue) {
        if (jsonValue == null || !"properties".equals(jsonValue.name())) {
            return;
        }
        Iterator<JsonValue> itIterator2 = jsonValue.iterator2();
        while (itIterator2.hasNext()) {
            JsonValue next = itIterator2.next();
            String string = next.getString("name", null);
            String string2 = next.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE, null);
            String string3 = next.getString("type", null);
            if (string2 == null && !"class".equals(string3)) {
                string2 = next.asString();
            }
            string3.getClass();
            if (string3.equals("object")) {
                loadObjectProperty(mapProperties, string, string2);
            } else if (string3.equals("class")) {
                MapProperties mapProperties2 = new MapProperties();
                String string4 = next.getString("propertytype");
                mapProperties2.put("type", string4);
                mapProperties.put(string, mapProperties2);
                loadJsonClassProperties(string4, mapProperties2, next.get(AppMeasurementSdk.ConditionalUserProperty.VALUE));
            } else {
                loadBasicProperty(mapProperties, string, string2, string3);
            }
        }
    }

    public abstract void addStaticTiles(FileHandle fileHandle, ImageResolver imageResolver, TiledMapTileSet tiledMapTileSet, JsonValue jsonValue, JsonValue jsonValue2, String str, int i, int i2, int i3, int i4, int i5, String str2, int i6, int i7, String str3, int i8, int i9, FileHandle fileHandle2);

    public void loadBasicLayerInfo(MapLayer mapLayer, JsonValue jsonValue) {
        String string = jsonValue.getString("name");
        float f = jsonValue.getFloat("opacity", 1.0f);
        String string2 = jsonValue.getString("tintcolor", "#ffffffff");
        boolean z = jsonValue.getBoolean("visible", true);
        float f2 = jsonValue.getFloat("offsetx", 0.0f);
        float f3 = jsonValue.getFloat("offsety", 0.0f);
        float f4 = jsonValue.getFloat("parallaxx", 1.0f);
        float f5 = jsonValue.getFloat("parallaxy", 1.0f);
        mapLayer.setName(string);
        mapLayer.setOpacity(f);
        mapLayer.setVisible(z);
        mapLayer.setOffsetX(f2);
        mapLayer.setOffsetY(f3);
        mapLayer.setParallaxX(f4);
        mapLayer.setParallaxY(f5);
        mapLayer.setTintColor(Color.valueOf(BaseTiledMapLoader.tiledColorToLibGDXColor(string2)));
    }

    public void loadImageLayer(TiledMap tiledMap, MapLayers mapLayers, JsonValue jsonValue, FileHandle fileHandle, ImageResolver imageResolver) {
        TextureRegion image;
        if (jsonValue.getString("type", "").equals("imagelayer")) {
            float f = jsonValue.getFloat("offsetx", 0.0f);
            float regionHeight = jsonValue.getFloat("offsety", 0.0f);
            if (this.flipY) {
                regionHeight = this.mapHeightInPixels - regionHeight;
            }
            String string = jsonValue.getString("image", "");
            boolean z = jsonValue.getInt("repeatx", 0) == 1;
            boolean z2 = jsonValue.getInt("repeaty", 0) == 1;
            if (string.isEmpty()) {
                image = null;
            } else {
                image = imageResolver.getImage(BaseTiledMapLoader.getRelativeFileHandle(fileHandle, string).path());
                regionHeight -= image.getRegionHeight();
            }
            TiledMapImageLayer tiledMapImageLayer = new TiledMapImageLayer(image, f, regionHeight, z, z2);
            loadBasicLayerInfo(tiledMapImageLayer, jsonValue);
            JsonValue jsonValue2 = jsonValue.get("properties");
            if (jsonValue2 != null) {
                loadProperties(tiledMapImageLayer.getProperties(), jsonValue2);
            }
            mapLayers.add(tiledMapImageLayer);
        }
    }

    public void loadLayer(TiledMap tiledMap, MapLayers mapLayers, JsonValue jsonValue, FileHandle fileHandle, ImageResolver imageResolver) {
        String string = jsonValue.getString("type", "");
        string.getClass();
        switch (string) {
            case "imagelayer":
                loadImageLayer(tiledMap, mapLayers, jsonValue, fileHandle, imageResolver);
                break;
            case "objectgroup":
                loadObjectGroup(tiledMap, mapLayers, jsonValue);
                break;
            case "tilelayer":
                loadTileLayer(tiledMap, mapLayers, jsonValue);
                break;
            case "group":
                loadLayerGroup(tiledMap, mapLayers, jsonValue, fileHandle, imageResolver);
                break;
        }
    }

    public void loadLayerGroup(TiledMap tiledMap, MapLayers mapLayers, JsonValue jsonValue, FileHandle fileHandle, ImageResolver imageResolver) {
        if (jsonValue.getString("type", "").equals("group")) {
            MapGroupLayer mapGroupLayer = new MapGroupLayer();
            loadBasicLayerInfo(mapGroupLayer, jsonValue);
            JsonValue jsonValue2 = jsonValue.get("properties");
            if (jsonValue2 != null) {
                loadProperties(mapGroupLayer.getProperties(), jsonValue2);
            }
            JsonValue jsonValue3 = jsonValue.get("layers");
            if (jsonValue3 != null) {
                Iterator<JsonValue> itIterator2 = jsonValue3.iterator2();
                while (itIterator2.hasNext()) {
                    loadLayer(tiledMap, mapGroupLayer.getLayers(), itIterator2.next(), fileHandle, imageResolver);
                }
            }
            Iterator<MapLayer> it = mapGroupLayer.getLayers().iterator();
            while (it.hasNext()) {
                it.next().setParent(mapGroupLayer);
            }
            mapLayers.add(mapGroupLayer);
        }
    }

    public void loadObject(TiledMap tiledMap, MapLayer mapLayer, JsonValue jsonValue) {
        loadObject(tiledMap, mapLayer.getObjects(), jsonValue, this.mapHeightInPixels);
    }

    public void loadObjectGroup(TiledMap tiledMap, MapLayers mapLayers, JsonValue jsonValue) {
        if (jsonValue.getString("type", "").equals("objectgroup")) {
            MapLayer mapLayer = new MapLayer();
            loadBasicLayerInfo(mapLayer, jsonValue);
            JsonValue jsonValue2 = jsonValue.get("properties");
            if (jsonValue2 != null) {
                loadProperties(mapLayer.getProperties(), jsonValue2);
            }
            Iterator<JsonValue> itIterator2 = jsonValue.get("objects").iterator2();
            while (itIterator2.hasNext()) {
                loadObject(tiledMap, mapLayer, itIterator2.next());
            }
            mapLayers.add(mapLayer);
        }
    }

    public void loadTileLayer(TiledMap tiledMap, MapLayers mapLayers, JsonValue jsonValue) {
        if (jsonValue.getString("type", "").equals("tilelayer")) {
            int i = jsonValue.getInt("width", 0);
            int i2 = jsonValue.getInt("height", 0);
            TiledMapTileLayer tiledMapTileLayer = new TiledMapTileLayer(i, i2, ((Integer) tiledMap.getProperties().get("tilewidth", Integer.class)).intValue(), ((Integer) tiledMap.getProperties().get("tileheight", Integer.class)).intValue());
            loadBasicLayerInfo(tiledMapTileLayer, jsonValue);
            int[] tileIds = getTileIds(jsonValue, i, i2);
            TiledMapTileSets tileSets = tiledMap.getTileSets();
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i; i4++) {
                    int i5 = tileIds[(i3 * i) + i4];
                    boolean z = (Integer.MIN_VALUE & i5) != 0;
                    boolean z2 = (1073741824 & i5) != 0;
                    boolean z3 = (536870912 & i5) != 0;
                    TiledMapTile tile = tileSets.getTile(i5 & 536870911);
                    if (tile != null) {
                        TiledMapTileLayer.Cell cellCreateTileLayerCell = createTileLayerCell(z, z2, z3);
                        cellCreateTileLayerCell.setTile(tile);
                        tiledMapTileLayer.setCell(i4, this.flipY ? (i2 - 1) - i3 : i3, cellCreateTileLayerCell);
                    }
                }
            }
            JsonValue jsonValue2 = jsonValue.get("properties");
            if (jsonValue2 != null) {
                loadProperties(tiledMapTileLayer.getProperties(), jsonValue2);
            }
            mapLayers.add(tiledMapTileLayer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void loadTileSet(JsonValue jsonValue, FileHandle fileHandle, ImageResolver imageResolver) {
        JsonValue jsonValue2;
        FileHandle relativeFileHandle;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        FileHandle relativeFileHandle2;
        int i5;
        int i6;
        if (jsonValue.getString("firstgid") != null) {
            int i7 = jsonValue.getInt("firstgid", 1);
            String string = jsonValue.getString("source", null);
            String string2 = "";
            if (string != null) {
                FileHandle relativeFileHandle3 = BaseTiledMapLoader.getRelativeFileHandle(fileHandle, string);
                try {
                    jsonValue2 = this.json.parse(relativeFileHandle3);
                    if (jsonValue2.has("image")) {
                        string2 = jsonValue2.getString("image");
                        i6 = jsonValue2.getInt("imagewidth", 0);
                        i5 = jsonValue2.getInt("imageheight", 0);
                        relativeFileHandle2 = BaseTiledMapLoader.getRelativeFileHandle(relativeFileHandle3, string2);
                    } else {
                        relativeFileHandle2 = null;
                        i5 = 0;
                        i6 = 0;
                    }
                    relativeFileHandle = relativeFileHandle2;
                    i2 = i5;
                    i = i6;
                    str = string2;
                } catch (SerializationException unused) {
                    throw new GdxRuntimeException("Error parsing external tileSet.");
                }
            } else if (jsonValue.has("image")) {
                String string3 = jsonValue.getString("image");
                int i8 = jsonValue.getInt("imagewidth", 0);
                jsonValue2 = jsonValue;
                i2 = jsonValue.getInt("imageheight", 0);
                i = i8;
                str = string3;
                relativeFileHandle = BaseTiledMapLoader.getRelativeFileHandle(fileHandle, string3);
            } else {
                jsonValue2 = jsonValue;
                relativeFileHandle = null;
                str = "";
                i = 0;
                i2 = 0;
            }
            String string4 = jsonValue2.getString("name", null);
            int i9 = jsonValue2.getInt("tilewidth", 0);
            int i10 = jsonValue2.getInt("tileheight", 0);
            int i11 = jsonValue2.getInt("spacing", 0);
            int i12 = jsonValue2.getInt("margin", 0);
            JsonValue jsonValue3 = jsonValue2.get("tileoffset");
            if (jsonValue3 != null) {
                int i13 = jsonValue3.getInt("x", 0);
                i4 = jsonValue3.getInt("y", 0);
                i3 = i13;
            } else {
                i3 = 0;
                i4 = 0;
            }
            TiledMapTileSet tiledMapTileSet = new TiledMapTileSet();
            tiledMapTileSet.setName(string4);
            MapProperties properties = tiledMapTileSet.getProperties();
            JsonValue jsonValue4 = jsonValue2.get("properties");
            if (jsonValue4 != null) {
                loadProperties(properties, jsonValue4);
            }
            properties.put("firstgid", Integer.valueOf(i7));
            JsonValue jsonValue5 = jsonValue2.get("tiles");
            if (jsonValue5 == null) {
                jsonValue5 = new JsonValue(JsonValue.ValueType.array);
            }
            JsonValue jsonValue6 = jsonValue5;
            TiledMapTileSet tiledMapTileSet2 = tiledMapTileSet;
            int i14 = i7;
            addStaticTiles(fileHandle, imageResolver, tiledMapTileSet, jsonValue2, jsonValue6, string4, i7, i9, i10, i11, i12, string, i3, i4, str, i, i2, relativeFileHandle);
            Array array = new Array();
            Iterator<JsonValue> itIterator2 = jsonValue6.iterator2();
            while (itIterator2.hasNext()) {
                JsonValue next = itIterator2.next();
                int i15 = i14;
                TiledMapTileSet tiledMapTileSet3 = tiledMapTileSet2;
                TiledMapTile tile = tiledMapTileSet3.getTile(next.getInt("id", 0) + i15);
                if (tile != null) {
                    AnimatedTiledMapTile animatedTiledMapTileCreateAnimatedTile = createAnimatedTile(tiledMapTileSet3, tile, next, i15);
                    if (animatedTiledMapTileCreateAnimatedTile != null) {
                        array.add(animatedTiledMapTileCreateAnimatedTile);
                        tile = animatedTiledMapTileCreateAnimatedTile;
                    }
                    addTileProperties(tile, next);
                    addTileObjectGroup(tile, next);
                }
                i14 = i15;
                tiledMapTileSet2 = tiledMapTileSet3;
            }
            TiledMapTileSet tiledMapTileSet4 = tiledMapTileSet2;
            Array.ArrayIterator it = array.iterator();
            while (it.hasNext()) {
                AnimatedTiledMapTile animatedTiledMapTile = (AnimatedTiledMapTile) it.next();
                tiledMapTileSet4.putTile(animatedTiledMapTile.getId(), animatedTiledMapTile);
            }
            this.map.getTileSets().addTileSet(tiledMapTileSet4);
        }
    }

    @Override // com.badlogic.gdx.maps.tiled.BaseTiledMapLoader
    public TiledMap loadTiledMap(FileHandle fileHandle, P p, ImageResolver imageResolver) {
        this.map = new TiledMap();
        this.idToObject = new IntMap<>();
        this.runOnEndOfLoadTiled = new Array<>();
        if (p != null) {
            this.convertObjectToTileSpace = p.convertObjectToTileSpace;
            this.flipY = p.flipY;
            loadProjectFile(p.projectFilePath);
        } else {
            this.convertObjectToTileSpace = false;
            this.flipY = true;
        }
        String string = this.root.getString(AdUnitActivity.EXTRA_ORIENTATION, null);
        int i = this.root.getInt("width", 0);
        int i2 = this.root.getInt("height", 0);
        int i3 = this.root.getInt("tilewidth", 0);
        int i4 = this.root.getInt("tileheight", 0);
        int i5 = this.root.getInt("hexsidelength", 0);
        String string2 = this.root.getString("staggeraxis", null);
        String string3 = this.root.getString("staggerindex", null);
        String string4 = this.root.getString("backgroundcolor", null);
        MapProperties properties = this.map.getProperties();
        if (string != null) {
            properties.put(AdUnitActivity.EXTRA_ORIENTATION, string);
        }
        properties.put("width", Integer.valueOf(i));
        properties.put("height", Integer.valueOf(i2));
        properties.put("tilewidth", Integer.valueOf(i3));
        properties.put("tileheight", Integer.valueOf(i4));
        properties.put("hexsidelength", Integer.valueOf(i5));
        if (string2 != null) {
            properties.put("staggeraxis", string2);
        }
        if (string3 != null) {
            properties.put("staggerindex", string3);
        }
        if (string4 != null) {
            properties.put("backgroundcolor", string4);
        }
        this.mapTileWidth = i3;
        this.mapTileHeight = i4;
        this.mapWidthInPixels = i * i3;
        this.mapHeightInPixels = i2 * i4;
        if (string != null && TypedValues.TransitionType.S_STAGGERED.equals(string) && i2 > 1) {
            this.mapWidthInPixels = (i3 / 2) + this.mapWidthInPixels;
            this.mapHeightInPixels = (i4 / 2) + (this.mapHeightInPixels / 2);
        }
        JsonValue jsonValue = this.root.get("properties");
        if (jsonValue != null) {
            loadProperties(this.map.getProperties(), jsonValue);
        }
        Iterator<JsonValue> itIterator2 = this.root.get("tilesets").iterator2();
        while (itIterator2.hasNext()) {
            loadTileSet(itIterator2.next(), fileHandle, imageResolver);
        }
        Iterator<JsonValue> itIterator3 = this.root.get("layers").iterator2();
        while (itIterator3.hasNext()) {
            JsonValue next = itIterator3.next();
            TiledMap tiledMap = this.map;
            loadLayer(tiledMap, tiledMap.getLayers(), next, fileHandle, imageResolver);
        }
        Array byType = this.map.getLayers().getByType(MapGroupLayer.class);
        while (byType.notEmpty()) {
            MapGroupLayer mapGroupLayer = (MapGroupLayer) byType.first();
            byType.removeIndex(0);
            for (MapLayer mapLayer : mapGroupLayer.getLayers()) {
                mapLayer.setParallaxX(mapGroupLayer.getParallaxX() * mapLayer.getParallaxX());
                mapLayer.setParallaxY(mapGroupLayer.getParallaxY() * mapLayer.getParallaxY());
                if (mapLayer instanceof MapGroupLayer) {
                    byType.add((MapGroupLayer) mapLayer);
                }
            }
        }
        Array.ArrayIterator<Runnable> it = this.runOnEndOfLoadTiled.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.runOnEndOfLoadTiled = null;
        return this.map;
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public Array<AssetDescriptor> getDependencies(String str, FileHandle fileHandle, P p) {
        this.root = this.json.parse(fileHandle);
        TextureLoader.TextureParameter textureParameter = new TextureLoader.TextureParameter();
        if (p != null) {
            textureParameter.genMipMaps = p.generateMipMaps;
            textureParameter.minFilter = p.textureMinFilter;
            textureParameter.magFilter = p.textureMagFilter;
        }
        return getDependencyAssetDescriptors(fileHandle, textureParameter);
    }

    public void loadObject(TiledMap tiledMap, TiledMapTile tiledMapTile, JsonValue jsonValue) {
        loadObject(tiledMap, tiledMapTile.getObjects(), jsonValue, tiledMapTile.getTextureRegion().getRegionHeight());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void loadObject(TiledMap tiledMap, MapObjects mapObjects, JsonValue jsonValue, float f) {
        MapObject ellipseMapObject;
        boolean z = this.convertObjectToTileSpace;
        float f2 = z ? 1.0f / this.mapTileWidth : 1.0f;
        float f3 = z ? 1.0f / this.mapTileHeight : 1.0f;
        float f4 = 0.0f;
        float f5 = jsonValue.getFloat("x", 0.0f) * f2;
        String str = "y";
        float f6 = (this.flipY ? f - jsonValue.getFloat("y", 0.0f) : jsonValue.getFloat("y", 0.0f)) * f3;
        float f7 = jsonValue.getFloat("width", 0.0f) * f2;
        float f8 = jsonValue.getFloat("height", 0.0f) * f3;
        JsonValue jsonValue2 = jsonValue.get("polygon");
        if (jsonValue2 != null) {
            float[] fArr = new float[jsonValue2.size * 2];
            Iterator<JsonValue> itIterator2 = jsonValue2.iterator2();
            int i = 0;
            while (itIterator2.hasNext()) {
                JsonValue next = itIterator2.next();
                int i2 = i + 1;
                fArr[i] = next.getFloat("x", f4) * f2;
                i += 2;
                fArr[i2] = next.getFloat("y", f4) * f3 * (this.flipY ? -1 : 1);
                f4 = 0.0f;
            }
            Polygon polygon = new Polygon(fArr);
            polygon.setPosition(f5, f6);
            ellipseMapObject = new PolygonMapObject(polygon);
        } else {
            JsonValue jsonValue3 = jsonValue.get("polyline");
            if (jsonValue3 != null) {
                float[] fArr2 = new float[jsonValue3.size * 2];
                Iterator<JsonValue> itIterator3 = jsonValue3.iterator2();
                int i3 = 0;
                while (itIterator3.hasNext()) {
                    JsonValue next2 = itIterator3.next();
                    int i4 = i3 + 1;
                    Iterator<JsonValue> it = itIterator3;
                    fArr2[i3] = next2.getFloat("x", 0.0f) * f2;
                    i3 += 2;
                    fArr2[i4] = next2.getFloat("y", 0.0f) * f3 * (this.flipY ? -1 : 1);
                    itIterator3 = it;
                }
                Polyline polyline = new Polyline(fArr2);
                polyline.setPosition(f5, f6);
                ellipseMapObject = new PolylineMapObject(polyline);
            } else if (jsonValue.get("ellipse") != null) {
                ellipseMapObject = new EllipseMapObject(f5, this.flipY ? f6 - f8 : f6, f7, f8);
            } else {
                ellipseMapObject = null;
            }
        }
        if (ellipseMapObject == null) {
            String string = jsonValue.getString("gid", null);
            if (string != null) {
                int i5 = (int) Long.parseLong(string);
                TiledMapTileMapObject tiledMapTileMapObject = new TiledMapTileMapObject(tiledMap.getTileSets().getTile(i5 & 536870911), (Integer.MIN_VALUE & i5) != 0, (i5 & 1073741824) != 0);
                TextureRegion textureRegion = tiledMapTileMapObject.getTextureRegion();
                tiledMapTileMapObject.getProperties().put("gid", Integer.valueOf(i5));
                tiledMapTileMapObject.setX(f5);
                tiledMapTileMapObject.setY(this.flipY ? f6 : f6 - f8);
                float f9 = jsonValue.getFloat("width", textureRegion.getRegionWidth());
                float f10 = jsonValue.getFloat("height", textureRegion.getRegionHeight());
                tiledMapTileMapObject.setScaleX((f9 / textureRegion.getRegionWidth()) * f2);
                tiledMapTileMapObject.setScaleY((f10 / textureRegion.getRegionHeight()) * f3);
                tiledMapTileMapObject.setRotation(jsonValue.getFloat(Key.ROTATION, 0.0f));
                ellipseMapObject = tiledMapTileMapObject;
                f7 = f7;
            } else {
                str = "y";
                ellipseMapObject = new RectangleMapObject(f5, this.flipY ? f6 - f8 : f6, f7, f8);
            }
        } else {
            str = "y";
        }
        ellipseMapObject.setName(jsonValue.getString("name", null));
        String string2 = jsonValue.getString(Key.ROTATION, null);
        if (string2 != null) {
            ellipseMapObject.getProperties().put(Key.ROTATION, Float.valueOf(Float.parseFloat(string2)));
        }
        Object string3 = jsonValue.getString("type", null);
        if (string3 != null) {
            ellipseMapObject.getProperties().put("type", string3);
        }
        int i6 = jsonValue.getInt("id", 0);
        if (i6 != 0) {
            ellipseMapObject.getProperties().put("id", Integer.valueOf(i6));
        }
        ellipseMapObject.getProperties().put("x", Float.valueOf(f5));
        if (ellipseMapObject instanceof TiledMapTileMapObject) {
            ellipseMapObject.getProperties().put(str, Float.valueOf(f6));
        } else {
            String str2 = str;
            MapProperties properties = ellipseMapObject.getProperties();
            if (this.flipY) {
                f6 -= f8;
            }
            properties.put(str2, Float.valueOf(f6));
        }
        ellipseMapObject.getProperties().put("width", Float.valueOf(f7));
        ellipseMapObject.getProperties().put("height", Float.valueOf(f8));
        ellipseMapObject.setVisible(jsonValue.getBoolean("visible", true));
        JsonValue jsonValue4 = jsonValue.get("properties");
        if (jsonValue4 != null) {
            loadProperties(ellipseMapObject.getProperties(), jsonValue4);
        }
        this.idToObject.put(i6, ellipseMapObject);
        mapObjects.add(ellipseMapObject);
    }
}
