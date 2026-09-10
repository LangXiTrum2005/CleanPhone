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
import com.badlogic.gdx.utils.ObjectMap;
import com.badlogic.gdx.utils.SerializationException;
import com.badlogic.gdx.utils.StreamUtils;
import com.badlogic.gdx.utils.XmlReader;
import com.bytedance.sdk.component.embedapplog.BuildConfig;
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
public abstract class BaseTmxMapLoader<P extends BaseTiledMapLoader.Parameters> extends BaseTiledMapLoader<P> {
    protected XmlReader.Element root;
    protected XmlReader xml;

    public BaseTmxMapLoader(FileHandleResolver fileHandleResolver) {
        super(fileHandleResolver);
        this.xml = new XmlReader();
    }

    private static String getPropertyValue(XmlReader.Element element) {
        return element.getAttribute(AppMeasurementSdk.ConditionalUserProperty.VALUE, element.getText());
    }

    public static int[] getTileIds(XmlReader.Element element, int i, int i2) {
        InputStream bufferedInputStream;
        XmlReader.Element childByName = element.getChildByName("data");
        String attribute = childByName.getAttribute("encoding", null);
        if (attribute == null) {
            throw new GdxRuntimeException("Unsupported encoding (XML) for TMX Layer Data");
        }
        int[] iArr = new int[i * i2];
        if (attribute.equals("csv")) {
            String[] strArrSplit = childByName.getText().split(",");
            for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                iArr[i3] = (int) Long.parseLong(strArrSplit[i3].trim());
            }
        } else {
            try {
                if (!attribute.equals("base64")) {
                    throw new GdxRuntimeException(DM.B("Unrecognised encoding (", attribute, ") for TMX Layer Data"));
                }
                try {
                    String attribute2 = childByName.getAttribute("compression", null);
                    byte[] bArrDecode = Base64Coder.decode(childByName.getText());
                    if (attribute2 == null) {
                        bufferedInputStream = new ByteArrayInputStream(bArrDecode);
                    } else if (attribute2.equals(Constants.CP_GZIP)) {
                        bufferedInputStream = new BufferedInputStream(new GZIPInputStream(new ByteArrayInputStream(bArrDecode), bArrDecode.length));
                    } else {
                        if (!attribute2.equals("zlib")) {
                            throw new GdxRuntimeException("Unrecognised compression (" + attribute2 + ") for TMX Layer Data");
                        }
                        bufferedInputStream = new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(bArrDecode)));
                    }
                    InputStream inputStream = bufferedInputStream;
                    byte[] bArr = new byte[4];
                    for (int i4 = 0; i4 < i2; i4++) {
                        for (int i5 = 0; i5 < i; i5++) {
                            int i6 = inputStream.read(bArr);
                            while (i6 < 4) {
                                int i7 = inputStream.read(bArr, i6, 4 - i6);
                                if (i7 == -1) {
                                    break;
                                }
                                i6 += i7;
                            }
                            if (i6 != 4) {
                                throw new GdxRuntimeException("Error Reading TMX Layer Data: Premature end of tile data");
                            }
                            iArr[(i4 * i) + i5] = BaseTiledMapLoader.unsignedByteToInt(bArr[0]) | (BaseTiledMapLoader.unsignedByteToInt(bArr[1]) << 8) | (BaseTiledMapLoader.unsignedByteToInt(bArr[2]) << 16) | (BaseTiledMapLoader.unsignedByteToInt(bArr[3]) << 24);
                        }
                    }
                    StreamUtils.closeQuietly(inputStream);
                } catch (IOException e) {
                    throw new GdxRuntimeException("Error Reading TMX Layer Data - IOException: " + e.getMessage());
                }
            } catch (Throwable th) {
                StreamUtils.closeQuietly(null);
                throw th;
            }
        }
        return iArr;
    }

    public abstract void addStaticTiles(FileHandle fileHandle, ImageResolver imageResolver, TiledMapTileSet tiledMapTileSet, XmlReader.Element element, Array<XmlReader.Element> array, String str, int i, int i2, int i3, int i4, int i5, String str2, int i6, int i7, String str3, int i8, int i9, FileHandle fileHandle2);

    public void addTileObjectGroup(TiledMapTile tiledMapTile, XmlReader.Element element) {
        XmlReader.Element childByName = element.getChildByName("objectgroup");
        if (childByName != null) {
            Array.ArrayIterator<XmlReader.Element> it = childByName.getChildrenByName("object").iterator();
            while (it.hasNext()) {
                loadObject(this.map, tiledMapTile, it.next());
            }
        }
    }

    public void addTileProperties(TiledMapTile tiledMapTile, XmlReader.Element element) {
        String attribute = element.getAttribute("terrain", null);
        if (attribute != null) {
            tiledMapTile.getProperties().put("terrain", attribute);
        }
        String attribute2 = element.getAttribute("probability", null);
        if (attribute2 != null) {
            tiledMapTile.getProperties().put("probability", attribute2);
        }
        String attribute3 = element.getAttribute("type", null);
        if (attribute3 != null) {
            tiledMapTile.getProperties().put("type", attribute3);
        }
        XmlReader.Element childByName = element.getChildByName("properties");
        if (childByName != null) {
            loadProperties(tiledMapTile.getProperties(), childByName);
        }
    }

    public AnimatedTiledMapTile createAnimatedTile(TiledMapTileSet tiledMapTileSet, TiledMapTile tiledMapTile, XmlReader.Element element, int i) {
        XmlReader.Element childByName = element.getChildByName("animation");
        if (childByName == null) {
            return null;
        }
        Array array = new Array();
        IntArray intArray = new IntArray();
        Array.ArrayIterator<XmlReader.Element> it = childByName.getChildrenByName(TypedValues.AttributesType.S_FRAME).iterator();
        while (it.hasNext()) {
            XmlReader.Element next = it.next();
            array.add((StaticTiledMapTile) tiledMapTileSet.getTile(next.getIntAttribute("tileid") + i));
            intArray.add(next.getIntAttribute("duration"));
        }
        AnimatedTiledMapTile animatedTiledMapTile = new AnimatedTiledMapTile(intArray, (Array<StaticTiledMapTile>) array);
        animatedTiledMapTile.setId(tiledMapTile.getId());
        return animatedTiledMapTile;
    }

    public XmlReader.Element getPropertyByName(XmlReader.Element element, String str) {
        Array.ArrayIterator<XmlReader.Element> it = element.getChildrenByNameRecursively("property").iterator();
        while (it.hasNext()) {
            XmlReader.Element next = it.next();
            if (str.equals(next.getAttribute("name"))) {
                return next;
            }
        }
        return null;
    }

    public void loadBasicLayerInfo(MapLayer mapLayer, XmlReader.Element element) {
        String attribute = element.getAttribute("name", null);
        float f = Float.parseFloat(element.getAttribute("opacity", BuildConfig.VERSION_NAME));
        String attribute2 = element.getAttribute("tintcolor", "#ffffffff");
        boolean z = element.getIntAttribute("visible", 1) == 1;
        float floatAttribute = element.getFloatAttribute("offsetx", 0.0f);
        float floatAttribute2 = element.getFloatAttribute("offsety", 0.0f);
        float floatAttribute3 = element.getFloatAttribute("parallaxx", 1.0f);
        float floatAttribute4 = element.getFloatAttribute("parallaxy", 1.0f);
        mapLayer.setName(attribute);
        mapLayer.setOpacity(f);
        mapLayer.setVisible(z);
        mapLayer.setOffsetX(floatAttribute);
        mapLayer.setOffsetY(floatAttribute2);
        mapLayer.setParallaxX(floatAttribute3);
        mapLayer.setParallaxY(floatAttribute4);
        mapLayer.setTintColor(Color.valueOf(BaseTiledMapLoader.tiledColorToLibGDXColor(attribute2)));
    }

    public void loadClassProperties(String str, MapProperties mapProperties, XmlReader.Element element) {
        ObjectMap<String, Array<BaseTiledMapLoader.ProjectClassMember>> objectMap = this.projectClassInfo;
        if (objectMap == null) {
            throw new GdxRuntimeException("No class information loaded to support class properties. Did you set the 'projectFilePath' parameter?");
        }
        if (objectMap.isEmpty()) {
            throw new GdxRuntimeException("No class information available. Did you set the correct Tiled project path in the 'projectFilePath' parameter?");
        }
        Array<BaseTiledMapLoader.ProjectClassMember> array = this.projectClassInfo.get(str);
        if (array == null) {
            throw new GdxRuntimeException(DM.B("There is no class with name '", str, "' in given Tiled project file."));
        }
        Array.ArrayIterator<BaseTiledMapLoader.ProjectClassMember> it = array.iterator();
        while (it.hasNext()) {
            BaseTiledMapLoader.ProjectClassMember next = it.next();
            String str2 = next.name;
            XmlReader.Element propertyByName = element == null ? null : getPropertyByName(element, str2);
            String str3 = next.type;
            str3.getClass();
            if (str3.equals("object")) {
                loadObjectProperty(mapProperties, str2, propertyByName == null ? next.defaultValue.asString() : getPropertyValue(propertyByName));
            } else if (str3.equals("class")) {
                MapProperties mapProperties2 = new MapProperties();
                String str4 = next.propertyType;
                mapProperties2.put("type", str4);
                mapProperties.put(str2, mapProperties2);
                if (propertyByName == null) {
                    loadJsonClassProperties(str4, mapProperties2, next.defaultValue);
                } else {
                    loadClassProperties(str4, mapProperties2, propertyByName);
                }
            } else {
                loadBasicProperty(mapProperties, str2, propertyByName == null ? next.defaultValue.asString() : getPropertyValue(propertyByName), next.type);
            }
        }
    }

    public void loadImageLayer(TiledMap tiledMap, MapLayers mapLayers, XmlReader.Element element, FileHandle fileHandle, ImageResolver imageResolver) {
        TextureRegion image;
        if (element.getName().equals("imagelayer")) {
            float f = element.hasAttribute("offsetx") ? Float.parseFloat(element.getAttribute("offsetx", "0")) : Float.parseFloat(element.getAttribute("x", "0"));
            float regionHeight = element.hasAttribute("offsety") ? Float.parseFloat(element.getAttribute("offsety", "0")) : Float.parseFloat(element.getAttribute("y", "0"));
            if (this.flipY) {
                regionHeight = this.mapHeightInPixels - regionHeight;
            }
            boolean z = element.getIntAttribute("repeatx", 0) == 1;
            boolean z2 = element.getIntAttribute("repeaty", 0) == 1;
            XmlReader.Element childByName = element.getChildByName("image");
            if (childByName != null) {
                image = imageResolver.getImage(BaseTiledMapLoader.getRelativeFileHandle(fileHandle, childByName.getAttribute("source")).path());
                regionHeight -= image.getRegionHeight();
            } else {
                image = null;
            }
            TiledMapImageLayer tiledMapImageLayer = new TiledMapImageLayer(image, f, regionHeight, z, z2);
            loadBasicLayerInfo(tiledMapImageLayer, element);
            XmlReader.Element childByName2 = element.getChildByName("properties");
            if (childByName2 != null) {
                loadProperties(tiledMapImageLayer.getProperties(), childByName2);
            }
            mapLayers.add(tiledMapImageLayer);
        }
    }

    public void loadLayer(TiledMap tiledMap, MapLayers mapLayers, XmlReader.Element element, FileHandle fileHandle, ImageResolver imageResolver) {
        String name = element.getName();
        if (name.equals("group")) {
            loadLayerGroup(tiledMap, mapLayers, element, fileHandle, imageResolver);
            return;
        }
        if (name.equals("layer")) {
            loadTileLayer(tiledMap, mapLayers, element);
        } else if (name.equals("objectgroup")) {
            loadObjectGroup(tiledMap, mapLayers, element);
        } else if (name.equals("imagelayer")) {
            loadImageLayer(tiledMap, mapLayers, element, fileHandle, imageResolver);
        }
    }

    public void loadLayerGroup(TiledMap tiledMap, MapLayers mapLayers, XmlReader.Element element, FileHandle fileHandle, ImageResolver imageResolver) {
        if (element.getName().equals("group")) {
            MapGroupLayer mapGroupLayer = new MapGroupLayer();
            loadBasicLayerInfo(mapGroupLayer, element);
            XmlReader.Element childByName = element.getChildByName("properties");
            if (childByName != null) {
                loadProperties(mapGroupLayer.getProperties(), childByName);
            }
            int childCount = element.getChildCount();
            for (int i = 0; i < childCount; i++) {
                loadLayer(tiledMap, mapGroupLayer.getLayers(), element.getChild(i), fileHandle, imageResolver);
            }
            Iterator<MapLayer> it = mapGroupLayer.getLayers().iterator();
            while (it.hasNext()) {
                it.next().setParent(mapGroupLayer);
            }
            mapLayers.add(mapGroupLayer);
        }
    }

    public void loadObject(TiledMap tiledMap, MapLayer mapLayer, XmlReader.Element element) {
        loadObject(tiledMap, mapLayer.getObjects(), element, this.mapHeightInPixels);
    }

    public void loadObjectGroup(TiledMap tiledMap, MapLayers mapLayers, XmlReader.Element element) {
        if (element.getName().equals("objectgroup")) {
            MapLayer mapLayer = new MapLayer();
            loadBasicLayerInfo(mapLayer, element);
            XmlReader.Element childByName = element.getChildByName("properties");
            if (childByName != null) {
                loadProperties(mapLayer.getProperties(), childByName);
            }
            Array.ArrayIterator<XmlReader.Element> it = element.getChildrenByName("object").iterator();
            while (it.hasNext()) {
                loadObject(tiledMap, mapLayer, it.next());
            }
            mapLayers.add(mapLayer);
        }
    }

    public void loadProperties(MapProperties mapProperties, XmlReader.Element element) {
        if (element != null && element.getName().equals("properties")) {
            Array.ArrayIterator<XmlReader.Element> it = element.getChildrenByName("property").iterator();
            while (it.hasNext()) {
                XmlReader.Element next = it.next();
                String attribute = next.getAttribute("name", null);
                String propertyValue = getPropertyValue(next);
                String attribute2 = next.getAttribute("type", null);
                if ("object".equals(attribute2)) {
                    loadObjectProperty(mapProperties, attribute, propertyValue);
                } else if ("class".equals(attribute2)) {
                    MapProperties mapProperties2 = new MapProperties();
                    String attribute3 = next.getAttribute("propertytype");
                    mapProperties2.put("type", attribute3);
                    mapProperties.put(attribute, mapProperties2);
                    loadClassProperties(attribute3, mapProperties2, next.getChildByName("properties"));
                } else {
                    loadBasicProperty(mapProperties, attribute, propertyValue, attribute2);
                }
            }
        }
    }

    public void loadTileLayer(TiledMap tiledMap, MapLayers mapLayers, XmlReader.Element element) {
        if (element.getName().equals("layer")) {
            int intAttribute = element.getIntAttribute("width", 0);
            int intAttribute2 = element.getIntAttribute("height", 0);
            TiledMapTileLayer tiledMapTileLayer = new TiledMapTileLayer(intAttribute, intAttribute2, ((Integer) tiledMap.getProperties().get("tilewidth", Integer.class)).intValue(), ((Integer) tiledMap.getProperties().get("tileheight", Integer.class)).intValue());
            loadBasicLayerInfo(tiledMapTileLayer, element);
            int[] tileIds = getTileIds(element, intAttribute, intAttribute2);
            TiledMapTileSets tileSets = tiledMap.getTileSets();
            for (int i = 0; i < intAttribute2; i++) {
                for (int i2 = 0; i2 < intAttribute; i2++) {
                    int i3 = tileIds[(i * intAttribute) + i2];
                    boolean z = (Integer.MIN_VALUE & i3) != 0;
                    boolean z2 = (1073741824 & i3) != 0;
                    boolean z3 = (536870912 & i3) != 0;
                    TiledMapTile tile = tileSets.getTile(i3 & 536870911);
                    if (tile != null) {
                        TiledMapTileLayer.Cell cellCreateTileLayerCell = createTileLayerCell(z, z2, z3);
                        cellCreateTileLayerCell.setTile(tile);
                        tiledMapTileLayer.setCell(i2, this.flipY ? (intAttribute2 - 1) - i : i, cellCreateTileLayerCell);
                    }
                }
            }
            XmlReader.Element childByName = element.getChildByName("properties");
            if (childByName != null) {
                loadProperties(tiledMapTileLayer.getProperties(), childByName);
            }
            mapLayers.add(tiledMapTileLayer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void loadTileSet(XmlReader.Element element, FileHandle fileHandle, ImageResolver imageResolver) {
        XmlReader.Element element2;
        FileHandle relativeFileHandle;
        String str;
        int i;
        int intAttribute;
        int i2;
        int intAttribute2;
        FileHandle relativeFileHandle2;
        int intAttribute3;
        int intAttribute4;
        if (element.getName().equals("tileset")) {
            int intAttribute5 = element.getIntAttribute("firstgid", 1);
            String attribute = element.getAttribute("source", null);
            String attribute2 = "";
            if (attribute != null) {
                FileHandle relativeFileHandle3 = BaseTiledMapLoader.getRelativeFileHandle(fileHandle, attribute);
                try {
                    element2 = this.xml.parse(relativeFileHandle3);
                    XmlReader.Element childByName = element2.getChildByName("image");
                    if (childByName != null) {
                        attribute2 = childByName.getAttribute("source");
                        intAttribute3 = childByName.getIntAttribute("width", 0);
                        intAttribute4 = childByName.getIntAttribute("height", 0);
                        relativeFileHandle2 = BaseTiledMapLoader.getRelativeFileHandle(relativeFileHandle3, attribute2);
                    } else {
                        relativeFileHandle2 = null;
                        intAttribute3 = 0;
                        intAttribute4 = 0;
                    }
                    relativeFileHandle = relativeFileHandle2;
                    i = intAttribute3;
                    intAttribute = intAttribute4;
                    str = attribute2;
                } catch (SerializationException unused) {
                    throw new GdxRuntimeException("Error parsing external tileset.");
                }
            } else {
                XmlReader.Element childByName2 = element.getChildByName("image");
                if (childByName2 != null) {
                    String attribute3 = childByName2.getAttribute("source");
                    int intAttribute6 = childByName2.getIntAttribute("width", 0);
                    element2 = element;
                    str = attribute3;
                    intAttribute = childByName2.getIntAttribute("height", 0);
                    i = intAttribute6;
                    relativeFileHandle = BaseTiledMapLoader.getRelativeFileHandle(fileHandle, attribute3);
                } else {
                    element2 = element;
                    relativeFileHandle = null;
                    str = "";
                    i = 0;
                    intAttribute = 0;
                }
            }
            String str2 = element2.get("name", null);
            int intAttribute7 = element2.getIntAttribute("tilewidth", 0);
            int intAttribute8 = element2.getIntAttribute("tileheight", 0);
            int intAttribute9 = element2.getIntAttribute("spacing", 0);
            int intAttribute10 = element2.getIntAttribute("margin", 0);
            XmlReader.Element childByName3 = element2.getChildByName("tileoffset");
            if (childByName3 != null) {
                int intAttribute11 = childByName3.getIntAttribute("x", 0);
                intAttribute2 = childByName3.getIntAttribute("y", 0);
                i2 = intAttribute11;
            } else {
                i2 = 0;
                intAttribute2 = 0;
            }
            TiledMapTileSet tiledMapTileSet = new TiledMapTileSet();
            tiledMapTileSet.setName(str2);
            MapProperties properties = tiledMapTileSet.getProperties();
            XmlReader.Element childByName4 = element2.getChildByName("properties");
            if (childByName4 != null) {
                loadProperties(properties, childByName4);
            }
            properties.put("firstgid", Integer.valueOf(intAttribute5));
            Array<XmlReader.Element> childrenByName = element2.getChildrenByName("tile");
            TiledMapTileSet tiledMapTileSet2 = tiledMapTileSet;
            int i3 = intAttribute5;
            addStaticTiles(fileHandle, imageResolver, tiledMapTileSet, element2, childrenByName, str2, intAttribute5, intAttribute7, intAttribute8, intAttribute9, intAttribute10, attribute, i2, intAttribute2, str, i, intAttribute, relativeFileHandle);
            Array array = new Array();
            Array.ArrayIterator<XmlReader.Element> it = childrenByName.iterator();
            while (it.hasNext()) {
                XmlReader.Element next = it.next();
                int i4 = i3;
                TiledMapTileSet tiledMapTileSet3 = tiledMapTileSet2;
                TiledMapTile tile = tiledMapTileSet3.getTile(next.getIntAttribute("id", 0) + i4);
                if (tile != null) {
                    AnimatedTiledMapTile animatedTiledMapTileCreateAnimatedTile = createAnimatedTile(tiledMapTileSet3, tile, next, i4);
                    if (animatedTiledMapTileCreateAnimatedTile != null) {
                        array.add(animatedTiledMapTileCreateAnimatedTile);
                        tile = animatedTiledMapTileCreateAnimatedTile;
                    }
                    addTileProperties(tile, next);
                    addTileObjectGroup(tile, next);
                }
                i3 = i4;
                tiledMapTileSet2 = tiledMapTileSet3;
            }
            TiledMapTileSet tiledMapTileSet4 = tiledMapTileSet2;
            Array.ArrayIterator it2 = array.iterator();
            while (it2.hasNext()) {
                AnimatedTiledMapTile animatedTiledMapTile = (AnimatedTiledMapTile) it2.next();
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
        String attribute = this.root.getAttribute(AdUnitActivity.EXTRA_ORIENTATION, null);
        int intAttribute = this.root.getIntAttribute("width", 0);
        int intAttribute2 = this.root.getIntAttribute("height", 0);
        int intAttribute3 = this.root.getIntAttribute("tilewidth", 0);
        int intAttribute4 = this.root.getIntAttribute("tileheight", 0);
        int intAttribute5 = this.root.getIntAttribute("hexsidelength", 0);
        String attribute2 = this.root.getAttribute("staggeraxis", null);
        String attribute3 = this.root.getAttribute("staggerindex", null);
        String attribute4 = this.root.getAttribute("backgroundcolor", null);
        MapProperties properties = this.map.getProperties();
        if (attribute != null) {
            properties.put(AdUnitActivity.EXTRA_ORIENTATION, attribute);
        }
        properties.put("width", Integer.valueOf(intAttribute));
        properties.put("height", Integer.valueOf(intAttribute2));
        properties.put("tilewidth", Integer.valueOf(intAttribute3));
        properties.put("tileheight", Integer.valueOf(intAttribute4));
        properties.put("hexsidelength", Integer.valueOf(intAttribute5));
        if (attribute2 != null) {
            properties.put("staggeraxis", attribute2);
        }
        if (attribute3 != null) {
            properties.put("staggerindex", attribute3);
        }
        if (attribute4 != null) {
            properties.put("backgroundcolor", attribute4);
        }
        this.mapTileWidth = intAttribute3;
        this.mapTileHeight = intAttribute4;
        this.mapWidthInPixels = intAttribute * intAttribute3;
        this.mapHeightInPixels = intAttribute2 * intAttribute4;
        if (attribute != null && TypedValues.TransitionType.S_STAGGERED.equals(attribute) && intAttribute2 > 1) {
            this.mapWidthInPixels = (intAttribute3 / 2) + this.mapWidthInPixels;
            this.mapHeightInPixels = (intAttribute4 / 2) + (this.mapHeightInPixels / 2);
        }
        XmlReader.Element childByName = this.root.getChildByName("properties");
        if (childByName != null) {
            loadProperties(this.map.getProperties(), childByName);
        }
        Array.ArrayIterator<XmlReader.Element> it = this.root.getChildrenByName("tileset").iterator();
        while (it.hasNext()) {
            XmlReader.Element next = it.next();
            loadTileSet(next, fileHandle, imageResolver);
            this.root.removeChild(next);
        }
        int childCount = this.root.getChildCount();
        for (int i = 0; i < childCount; i++) {
            XmlReader.Element child = this.root.getChild(i);
            TiledMap tiledMap = this.map;
            loadLayer(tiledMap, tiledMap.getLayers(), child, fileHandle, imageResolver);
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
        Array.ArrayIterator<Runnable> it2 = this.runOnEndOfLoadTiled.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        this.runOnEndOfLoadTiled = null;
        return this.map;
    }

    @Override // com.badlogic.gdx.assets.loaders.AssetLoader
    public Array<AssetDescriptor> getDependencies(String str, FileHandle fileHandle, P p) {
        this.root = this.xml.parse(fileHandle);
        TextureLoader.TextureParameter textureParameter = new TextureLoader.TextureParameter();
        if (p != null) {
            textureParameter.genMipMaps = p.generateMipMaps;
            textureParameter.minFilter = p.textureMinFilter;
            textureParameter.magFilter = p.textureMagFilter;
        }
        return getDependencyAssetDescriptors(fileHandle, textureParameter);
    }

    public void loadObject(TiledMap tiledMap, TiledMapTile tiledMapTile, XmlReader.Element element) {
        loadObject(tiledMap, tiledMapTile.getObjects(), element, tiledMapTile.getTextureRegion().getRegionHeight());
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0135  */
    /* JADX WARN: Code duplicated, block: B:51:0x013e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0148  */
    /* JADX WARN: Code duplicated, block: B:54:0x014a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0181  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:79:0x0208  */
    /* JADX WARN: Code duplicated, block: B:82:0x0224  */
    /* JADX WARN: Code duplicated, block: B:83:0x0232  */
    /* JADX WARN: Code duplicated, block: B:85:0x023c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0263  */
    /* JADX WARN: Code duplicated, block: B:90:0x0265  */
    /* JADX WARN: Code duplicated, block: B:93:0x0271  */
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
    public void loadObject(TiledMap tiledMap, MapObjects mapObjects, XmlReader.Element element, float f) {
        String str;
        MapObject rectangleMapObject;
        String attribute;
        Object attribute2;
        int intAttribute;
        boolean z;
        XmlReader.Element childByName;
        String attribute3;
        float f2;
        int i;
        boolean z2;
        boolean z3;
        float f3;
        if (element.getName().equals("object")) {
            boolean z4 = this.convertObjectToTileSpace;
            float f4 = z4 ? 1.0f / this.mapTileWidth : 1.0f;
            float f5 = z4 ? 1.0f / this.mapTileHeight : 1.0f;
            float floatAttribute = element.getFloatAttribute("x", 0.0f) * f4;
            float floatAttribute2 = (this.flipY ? f - element.getFloatAttribute("y", 0.0f) : element.getFloatAttribute("y", 0.0f)) * f5;
            float floatAttribute3 = element.getFloatAttribute("width", 0.0f) * f4;
            float floatAttribute4 = element.getFloatAttribute("height", 0.0f) * f5;
            if (element.getChildCount() > 0) {
                XmlReader.Element childByName2 = element.getChildByName("polygon");
                if (childByName2 != null) {
                    String[] strArrSplit = childByName2.getAttribute("points").split(" ");
                    float[] fArr = new float[strArrSplit.length * 2];
                    str = "y";
                    int i2 = 0;
                    while (i2 < strArrSplit.length) {
                        String[] strArrSplit2 = strArrSplit[i2].split(",");
                        int i3 = i2 * 2;
                        fArr[i3] = Float.parseFloat(strArrSplit2[0]) * f4;
                        String[] strArr = strArrSplit;
                        fArr[i3 + 1] = Float.parseFloat(strArrSplit2[1]) * f5 * (this.flipY ? -1 : 1);
                        i2++;
                        strArrSplit = strArr;
                    }
                    Polygon polygon = new Polygon(fArr);
                    polygon.setPosition(floatAttribute, floatAttribute2);
                    rectangleMapObject = new PolygonMapObject(polygon);
                } else {
                    str = "y";
                    XmlReader.Element childByName3 = element.getChildByName("polyline");
                    if (childByName3 != null) {
                        String[] strArrSplit3 = childByName3.getAttribute("points").split(" ");
                        float[] fArr2 = new float[strArrSplit3.length * 2];
                        int i4 = 0;
                        while (i4 < strArrSplit3.length) {
                            String[] strArrSplit4 = strArrSplit3[i4].split(",");
                            int i5 = i4 * 2;
                            fArr2[i5] = Float.parseFloat(strArrSplit4[0]) * f4;
                            String[] strArr2 = strArrSplit3;
                            fArr2[i5 + 1] = Float.parseFloat(strArrSplit4[1]) * f5 * (this.flipY ? -1 : 1);
                            i4++;
                            strArrSplit3 = strArr2;
                        }
                        Polyline polyline = new Polyline(fArr2);
                        polyline.setPosition(floatAttribute, floatAttribute2);
                        rectangleMapObject = new PolylineMapObject(polyline);
                    } else if (element.getChildByName("ellipse") != null) {
                        rectangleMapObject = new EllipseMapObject(floatAttribute, this.flipY ? floatAttribute2 - floatAttribute4 : floatAttribute2, floatAttribute3, floatAttribute4);
                    }
                }
                if (rectangleMapObject != null) {
                    attribute3 = element.getAttribute("gid", null);
                    if (attribute3 != null) {
                        i = (int) Long.parseLong(attribute3);
                        if ((Integer.MIN_VALUE & i) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if ((1073741824 & i) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        TiledMapTileMapObject tiledMapTileMapObject = new TiledMapTileMapObject(tiledMap.getTileSets().getTile(i & 536870911), z2, z3);
                        TextureRegion textureRegion = tiledMapTileMapObject.getTextureRegion();
                        tiledMapTileMapObject.getProperties().put("gid", Integer.valueOf(i));
                        tiledMapTileMapObject.setX(floatAttribute);
                        if (this.flipY) {
                            f3 = floatAttribute2;
                        } else {
                            f3 = floatAttribute2 - floatAttribute4;
                        }
                        tiledMapTileMapObject.setY(f3);
                        float floatAttribute5 = element.getFloatAttribute("width", textureRegion.getRegionWidth());
                        float floatAttribute6 = element.getFloatAttribute("height", textureRegion.getRegionHeight());
                        tiledMapTileMapObject.setScaleX((floatAttribute5 / textureRegion.getRegionWidth()) * f4);
                        tiledMapTileMapObject.setScaleY((floatAttribute6 / textureRegion.getRegionHeight()) * f5);
                        tiledMapTileMapObject.setRotation(element.getFloatAttribute(Key.ROTATION, 0.0f));
                        rectangleMapObject = tiledMapTileMapObject;
                        floatAttribute3 = floatAttribute3;
                    } else {
                        if (this.flipY) {
                            f2 = floatAttribute2 - floatAttribute4;
                        } else {
                            f2 = floatAttribute2;
                        }
                        floatAttribute3 = floatAttribute3;
                        rectangleMapObject = new RectangleMapObject(floatAttribute, f2, floatAttribute3, floatAttribute4);
                    }
                }
                rectangleMapObject.setName(element.getAttribute("name", null));
                attribute = element.getAttribute(Key.ROTATION, null);
                if (attribute != null) {
                    rectangleMapObject.getProperties().put(Key.ROTATION, Float.valueOf(Float.parseFloat(attribute)));
                }
                attribute2 = element.getAttribute("type", null);
                if (attribute2 != null) {
                    rectangleMapObject.getProperties().put("type", attribute2);
                }
                intAttribute = element.getIntAttribute("id", 0);
                if (intAttribute != 0) {
                    rectangleMapObject.getProperties().put("id", Integer.valueOf(intAttribute));
                }
                rectangleMapObject.getProperties().put("x", Float.valueOf(floatAttribute));
                if (rectangleMapObject instanceof TiledMapTileMapObject) {
                    rectangleMapObject.getProperties().put(str, Float.valueOf(floatAttribute2));
                } else {
                    String str2 = str;
                    MapProperties properties = rectangleMapObject.getProperties();
                    if (this.flipY) {
                        floatAttribute2 -= floatAttribute4;
                    }
                    properties.put(str2, Float.valueOf(floatAttribute2));
                }
                rectangleMapObject.getProperties().put("width", Float.valueOf(floatAttribute3));
                rectangleMapObject.getProperties().put("height", Float.valueOf(floatAttribute4));
                if (element.getIntAttribute("visible", 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                rectangleMapObject.setVisible(z);
                childByName = element.getChildByName("properties");
                if (childByName != null) {
                    loadProperties(rectangleMapObject.getProperties(), childByName);
                }
                this.idToObject.put(intAttribute, rectangleMapObject);
                mapObjects.add(rectangleMapObject);
            }
            str = "y";
            rectangleMapObject = null;
            if (rectangleMapObject != null) {
                attribute3 = element.getAttribute("gid", null);
                if (attribute3 != null) {
                    i = (int) Long.parseLong(attribute3);
                    if ((Integer.MIN_VALUE & i) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((1073741824 & i) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    TiledMapTileMapObject tiledMapTileMapObject2 = new TiledMapTileMapObject(tiledMap.getTileSets().getTile(i & 536870911), z2, z3);
                    TextureRegion textureRegion2 = tiledMapTileMapObject2.getTextureRegion();
                    tiledMapTileMapObject2.getProperties().put("gid", Integer.valueOf(i));
                    tiledMapTileMapObject2.setX(floatAttribute);
                    if (this.flipY) {
                        f3 = floatAttribute2;
                    } else {
                        f3 = floatAttribute2 - floatAttribute4;
                    }
                    tiledMapTileMapObject2.setY(f3);
                    float floatAttribute7 = element.getFloatAttribute("width", textureRegion2.getRegionWidth());
                    float floatAttribute8 = element.getFloatAttribute("height", textureRegion2.getRegionHeight());
                    tiledMapTileMapObject2.setScaleX((floatAttribute7 / textureRegion2.getRegionWidth()) * f4);
                    tiledMapTileMapObject2.setScaleY((floatAttribute8 / textureRegion2.getRegionHeight()) * f5);
                    tiledMapTileMapObject2.setRotation(element.getFloatAttribute(Key.ROTATION, 0.0f));
                    rectangleMapObject = tiledMapTileMapObject2;
                    floatAttribute3 = floatAttribute3;
                } else {
                    if (this.flipY) {
                        f2 = floatAttribute2 - floatAttribute4;
                    } else {
                        f2 = floatAttribute2;
                    }
                    floatAttribute3 = floatAttribute3;
                    rectangleMapObject = new RectangleMapObject(floatAttribute, f2, floatAttribute3, floatAttribute4);
                }
            }
            rectangleMapObject.setName(element.getAttribute("name", null));
            attribute = element.getAttribute(Key.ROTATION, null);
            if (attribute != null) {
                rectangleMapObject.getProperties().put(Key.ROTATION, Float.valueOf(Float.parseFloat(attribute)));
            }
            attribute2 = element.getAttribute("type", null);
            if (attribute2 != null) {
                rectangleMapObject.getProperties().put("type", attribute2);
            }
            intAttribute = element.getIntAttribute("id", 0);
            if (intAttribute != 0) {
                rectangleMapObject.getProperties().put("id", Integer.valueOf(intAttribute));
            }
            rectangleMapObject.getProperties().put("x", Float.valueOf(floatAttribute));
            if (rectangleMapObject instanceof TiledMapTileMapObject) {
                rectangleMapObject.getProperties().put(str, Float.valueOf(floatAttribute2));
            } else {
                String str3 = str;
                MapProperties properties2 = rectangleMapObject.getProperties();
                if (this.flipY) {
                    floatAttribute2 -= floatAttribute4;
                }
                properties2.put(str3, Float.valueOf(floatAttribute2));
            }
            rectangleMapObject.getProperties().put("width", Float.valueOf(floatAttribute3));
            rectangleMapObject.getProperties().put("height", Float.valueOf(floatAttribute4));
            if (element.getIntAttribute("visible", 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            rectangleMapObject.setVisible(z);
            childByName = element.getChildByName("properties");
            if (childByName != null) {
                loadProperties(rectangleMapObject.getProperties(), childByName);
            }
            this.idToObject.put(intAttribute, rectangleMapObject);
            mapObjects.add(rectangleMapObject);
        }
    }
}
