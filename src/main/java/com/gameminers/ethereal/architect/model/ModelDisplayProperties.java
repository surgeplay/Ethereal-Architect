/*
 *  Ethereal Architect
 *  Copyright (C) 2014-2015 Aesen Vismea
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.gameminers.ethereal.architect.model;

public class ModelDisplayProperties {
	private ModelTranslation thirdperson = new ModelTranslation();
	private ModelTranslation firstperson = new ModelTranslation();
	private ModelTranslation gui = new ModelTranslation();
	private ModelTranslation head = new ModelTranslation();
	public ModelTranslation getThirdperson() {
		return thirdperson;
	}
	public ModelTranslation getFirstperson() {
		return firstperson;
	}
	public ModelTranslation getGui() {
		return gui;
	}
	public ModelTranslation getHead() {
		return head;
	}
}
