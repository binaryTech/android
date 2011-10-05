/*
 *  Copyright (C) 2011 Opentracker.net 
 * 
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2 of the License, or (at your option) any later version.
 * 
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 * 
 *  The full license is located at the root of this distribution
 *  in the LICENSE file.
 *
 *  Please report bugs to support@opentracker.net
 *
 */
package net.opentracker.android;

import android.util.Log;

/**
 * 
 * This class is provided to identify the version and is used to provide
 * debugging information for Opentracker's logging/ analytics engines.
 * 
 * @author $Author: eddie $
 * @version $Id: OTSvnVersion.java 13226 2011-09-23 09:04:45Z eddie $
 */
public final class OTSvnVersion {

    private static final String TAG = OTSvnVersion.class.getName();

    // SVN should fill this out with the latest tag when it's checked out:
    // http://stackoverflow.com/questions/690419/build-and-version-numbering-for-java-projects-ant-cvs-hudson
    // http://stackoverflow.com/questions/2295661/fill-version-tag-with-subversion-in-eclipse
    private static final String SVN_REVISION_RAW = "$Revision: 13226 $";

    private static final String SVN_LASTCHANGEDDATE_RAW =
            "$Date: 2011-09-23 11:04:45 +0200 (Fri, 23 Sep 2011) $";

    private static final String SVN_REVISION =
            SVN_REVISION_RAW.replaceAll("\\$Revision:\\s*", "").replaceAll(
                    "\\s*\\$", "");

    private static final String SVN_LASTCHANGEDDATE =
            SVN_LASTCHANGEDDATE_RAW.replaceAll("\\$LastChangedDate:\\s*", "")
                    .replaceAll("\\s*\\$", "");

    /**
     * Gets the revision number of this file in Subversion
     * 
     * @return svn's revision number of this file
     */
    public static String getRevision() {
        Log.v(TAG, "getRevision()");
        return SVN_REVISION;
    }

    /**
     * Gets the last changed date of this file in Subversion
     * 
     * @return svn's last changed date of this file
     */
    public static String getLastChangedDate() {
        Log.v(TAG, "getLastChangedDate()");
        return SVN_LASTCHANGEDDATE;
    }
}