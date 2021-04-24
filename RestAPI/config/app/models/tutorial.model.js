module.exports = mongoose => {
    var schema = mongoose.Schema(
      {
        idBarang: String,
        harga: Double,
        nama: String,
        kategori: String,
        idUser: String,
        stok: String,
        createdDate: String,
        hargaJual: Double,
        barcode: String
      },
      { timestamps: true }
    );
  
    schema.method("toJSON", function() {
      const { __v, _id, ...object } = this.toObject();
      object.id = _id;
      return object;
    });
  
    const Tutorial = mongoose.model("tutorial", schema);
    return Tutorial;
  };