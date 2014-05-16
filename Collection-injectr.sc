+ Collection {
	injectr { | thisValue, function |
		var size = this.size;
		var nextValue = thisValue;
		this.do { | item, i |
			nextValue = function.value(nextValue, this.at(size-1-i), i);
		};
		^nextValue
	}
}