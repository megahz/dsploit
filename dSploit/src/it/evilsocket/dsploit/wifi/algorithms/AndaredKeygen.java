/*
 * This file is part of the dSploit.
 *
 * Copyleft of Simone Margaritelli aka evilsocket <evilsocket@gmail.com>
 *
 * dSploit is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * dSploit is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with dSploit.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.evilsocket.dsploit.wifi.algorithms;

import java.util.List;

import it.evilsocket.dsploit.wifi.Keygen;

/*
 * This is not actual an algorithm as
 * it is just a default WPA password.
 */
public class AndaredKeygen extends Keygen {

    public AndaredKeygen(String ssid, String mac, int level, String enc) {
        super(ssid, mac, level, enc);
    }

    @Override
    public List<String> getKeys() {
        addPassword("6b629f4c299371737494c61b5a101693a2d4e9e1f3e1320f3ebf9ae379cecf32");
        return getResults();
    }
}
