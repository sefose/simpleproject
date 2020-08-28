import axios from "axios";
const URL = process.env.APIURL + "dummy";

export const findAllDummies = () => {
  return axios.get(URL);
};

export const saveDummy = (dummy) => {
  return axios.post(URL, dummy);
};


